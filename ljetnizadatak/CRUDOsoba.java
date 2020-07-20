package vidanec.ljetnizadatak;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CRUDOsoba {
	
	// unos osobe
	public static void create(Osoba osoba) {
		try {
			PreparedStatement izraz = Baza.getVeza().prepareStatement("insert into osoba" + "(ime,prezime,broj_tel,oib)" + "values (?,?,?,?)");
			
			izraz.setString(1, osoba.getIme());
			izraz.setString(2, osoba.getPrezime());
			izraz.setString(3, osoba.getBroj_tel());
			izraz.setString(4, osoba.getOib());
			
			izraz.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	// ispis osoba
	public static List<Osoba> read() {
		List<Osoba> osobe = new ArrayList<>();
		try {
			PreparedStatement izraz = Baza.getVeza().prepareStatement("select * from osoba order by prezime");
			ResultSet rs = izraz.executeQuery();
			
			while(rs.next()) {
				osobe.add(new Osoba(
						rs.getInt("sifra"),
						rs.getString("ime"),
						rs.getString("prezime"),
						rs.getString("broj_tel"),
						rs.getString("oib")
						)
						);
			}
			rs.close();
			izraz.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return osobe;
	}
	
	public static void updateOsoba(Osoba osoba) {
		try {
			PreparedStatement izraz = Baza.getVeza().prepareStatement(
					"update osoba set "
					+ " ime=?, "
					+ " prezime=?, "
					+ " broj_tel=?, "
					+ " oib=? "
					+ " where sifra=? ");
			
			izraz.setString(1, osoba.getIme());
			izraz.setString(2, osoba.getPrezime());
			izraz.setString(3, osoba.getBroj_tel());
			izraz.setString(4, osoba.getOib());
			izraz.setInt(5, osoba.getSifra());
			
			izraz.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void deleteOsoba(int sifra) {
		try {
			PreparedStatement izraz = Baza.getVeza().prepareStatement("delete from osoba " + " where sifra=? ");
			izraz.setInt(1, sifra);
			izraz.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Osoba getOsoba(int redniBroj) {
		int rb=0;
		for(Osoba o: read()) {
			if(++rb==redniBroj) {
				return o;
			}
		}
		return null;
	}
}
