public class HistoryPelanggan {
    private JPanel panel1;
    private JTable table1;
    private JButton backButton;
    public HistoryPelanggan() {
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu menu = new Menu();
                menu.startMenu();
            }
        });
    }
    public static void startHistoryPelanggan() {
        JFrame frame = new JFrame("History Pelanggan");
        frame.setContentPane(new HistoryPelanggan().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
