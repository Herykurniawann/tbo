import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu {
    private JButton tambahOrderanButton;
    private JButton cekOrderanButton;
    private JButton historyPelangganButton;
public Menu() {
    tambahOrderanButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            TambahOrder tambahOrderan = new TambahOrder();
        }
    });
    cekOrderanButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            CekOrderan cekOrderan = new CekOrderan();
        }
    });
    historyPelangganButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            HistoryPelanggan historyPelanggan = new HistoryPelanggan();
        }
    });
}

    public static void startMenu() {
        JFrame frame = new JFrame("Menu");
        frame.setContentPane(new Menu().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
