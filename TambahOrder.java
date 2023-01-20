import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;

public class TambahOrder {
    private JTextField tfNama;
    private JTextField tfNIK;
    private JTextField tfAlamat;
    private JTextField tfNoTlpn;
    private JComboBox cbKamera;
    private JRadioButton rdTambah;
    private JRadioButton rdHapus;
    private JButton button1;
    private JSpinner spLamaSewa;

    public TambahOrder() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//            add to database
                addData();


            }
        });
    }

    public void addData() {
        String nama = tfNama.getText();
        String nik = tfNIK.getText();
        String alamat = tfAlamat.getText();
        String noTlpn = tfNoTlpn.getText();
        String kamera = cbKamera.getSelectedItem().toString();
        String lamaSewa = spLamaSewa.getValue().toString();
        String tambahHapus = "";
        if (rdTambah.isSelected()) {
            tambahHapus = "Tambah";
        } else if (rdHapus.isSelected()) {
            tambahHapus = "Hapus";
        }
        try {
            Connection con = new Connection();
            con.getConnection();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
