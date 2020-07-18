package vidanec.ljetnizadatak;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CRUDOsoba {

	// ispis
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
}
