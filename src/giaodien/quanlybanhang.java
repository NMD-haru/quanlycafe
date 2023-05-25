package giaodien;

import entity.menu;
import entity.user;
import entity.hoadon;
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class quanlybanhang extends javax.swing.JFrame {

    DefaultTableModel Menu1 = new DefaultTableModel();
    DefaultTableModel Order1 = new DefaultTableModel();
    int k = 1;
    int money = 0;

    /**
     * Creates new form NewJFrame
     *
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException
     */
    public quanlybanhang() throws SQLException, ClassNotFoundException {
        initComponents();
        LoadOrder();
        LoadData2Table();
        LoadPage1();
        jSpinner1.setValue(1);
        icon();
    }

    public void icon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/giaodien/images.png")));
    }

    private void LoadOrder() throws SQLException, ClassNotFoundException {
        //--- Thêm các tiêu đề cho cột của bảng hiển thị
        Order1.setRowCount(0);
        Order1.addColumn("Món");
        Order1.addColumn("Số lượng");
    }

    private void LoadData2Table() throws SQLException, ClassNotFoundException {
        List<menu> b = dao.daomenu.getALLMN();
        //--- Thêm các tiêu đề cho cột của bảng hiển thị
        Menu1.addColumn("tenh");
        Menu1.addColumn("dongia");
        //--- frmadd lần lượt các row
        for (menu mn1 : b) {
            Vector<String> row = new Vector<>();
            if (mn1.getTenh() != null) {
                row.addElement(mn1.getTenh());
                row.addElement(String.valueOf(mn1.getDongia()));
            }
            Menu1.addRow(row);
        }
    }

    private void LoadPage1() throws SQLException, ClassNotFoundException {
        m1.setText("");
        m2.setText("");
        m3.setText("");
        m4.setText("");
        m5.setText("");
        m6.setText("");
        m7.setText("");
        m8.setText("");
        m9.setText("");
        if (Menu1.getRowCount() >= 1) {
            m1.setText((String) Menu1.getValueAt(0, 0));
            if (Menu1.getRowCount() >= 2) {
                m2.setText((String) Menu1.getValueAt(1, 0));
                if (Menu1.getRowCount() >= 3) {
                    m3.setText((String) Menu1.getValueAt(2, 0));
                    if (Menu1.getRowCount() >= 4) {
                        m4.setText((String) Menu1.getValueAt(3, 0));
                        if (Menu1.getRowCount() >= 5) {
                            m5.setText((String) Menu1.getValueAt(4, 0));
                            if (Menu1.getRowCount() >= 6) {
                                m6.setText((String) Menu1.getValueAt(5, 0));
                                if (Menu1.getRowCount() >= 7) {
                                    m7.setText((String) Menu1.getValueAt(6, 0));
                                    if (Menu1.getRowCount() >= 8) {
                                        m8.setText((String) Menu1.getValueAt(7, 0));
                                        if (Menu1.getRowCount() >= 9) {
                                            m9.setText((String) Menu1.getValueAt(8, 0));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private void LoadPage2() throws SQLException, ClassNotFoundException {
        m1.setText("");
        m2.setText("");
        m3.setText("");
        m4.setText("");
        m5.setText("");
        m6.setText("");
        m7.setText("");
        m8.setText("");
        m9.setText("");
        if (Menu1.getRowCount() >= 10) {
            m1.setText((String) Menu1.getValueAt(9, 0));
            if (Menu1.getRowCount() >= 11) {
                m2.setText((String) Menu1.getValueAt(10, 0));
                if (Menu1.getRowCount() >= 12) {
                    m3.setText((String) Menu1.getValueAt(11, 0));
                    if (Menu1.getRowCount() >= 13) {
                        m4.setText((String) Menu1.getValueAt(12, 0));
                        if (Menu1.getRowCount() >= 14) {
                            m5.setText((String) Menu1.getValueAt(13, 0));
                            if (Menu1.getRowCount() >= 15) {
                                m6.setText((String) Menu1.getValueAt(14, 0));
                                if (Menu1.getRowCount() >= 16) {
                                    m7.setText((String) Menu1.getValueAt(15, 0));
                                    if (Menu1.getRowCount() >= 17) {
                                        m8.setText((String) Menu1.getValueAt(16, 0));
                                        if (Menu1.getRowCount() >= 18) {
                                            m9.setText((String) Menu1.getValueAt(17, 0));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        page1 = new javax.swing.JButton();
        page2 = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        m5 = new javax.swing.JButton();
        m7 = new javax.swing.JButton();
        m9 = new javax.swing.JButton();
        m8 = new javax.swing.JButton();
        m2 = new javax.swing.JButton();
        m3 = new javax.swing.JButton();
        m6 = new javax.swing.JButton();
        m1 = new javax.swing.JButton();
        m4 = new javax.swing.JButton();
        sotrang = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        giam = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        addmon = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        tem = new javax.swing.JTextField();
        xoamon = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        picked1 = new javax.swing.JLabel();
        xoa = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        OrderTab = new org.jdesktop.swingx.JXTable();
        USER = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        picked = new javax.swing.JLabel();
        money1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        add = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageicon/icons8-restaurant-menu-50.png"))); // NOI18N
        jLabel1.setText("MENU");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        page1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageicon/icons8-ingredients-50.png"))); // NOI18N
        page1.setText("MÓN ĂN");
        page1.setBorder(null);
        page1.setBorderPainted(false);
        page1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                page1ActionPerformed(evt);
            }
        });

        page2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageicon/icons8-coffee-to-go-50.png"))); // NOI18N
        page2.setText("ĐỒ UỐNG");
        page2.setBorder(null);
        page2.setBorderPainted(false);
        page2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                page2ActionPerformed(evt);
            }
        });

        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageicon/Go Back_50px.png"))); // NOI18N
        Back.setText("Quay lại");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        m5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m5ActionPerformed(evt);
            }
        });

        m7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m7ActionPerformed(evt);
            }
        });

        m9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m9ActionPerformed(evt);
            }
        });

        m8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m8ActionPerformed(evt);
            }
        });

        m2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m2ActionPerformed(evt);
            }
        });

        m3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m3ActionPerformed(evt);
            }
        });

        m6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m6ActionPerformed(evt);
            }
        });

        m1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m1ActionPerformed(evt);
            }
        });

        m4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m4ActionPerformed(evt);
            }
        });

        sotrang.setText("Trang 1/2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(57, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(m1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(m2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(m4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(m5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(m3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(m6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(m7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(m8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(m9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(sotrang)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(sotrang))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setText("Giá :");

        addmon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageicon/Plus_50px.png"))); // NOI18N
        addmon.setText("Thêm món");
        addmon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addmonActionPerformed(evt);
            }
        });

        jLabel7.setText("Tên món: ");

        xoamon.setText("Xóa món");
        xoamon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoamonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tem)
                    .addComponent(giam, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addmon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xoamon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(giam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(xoamon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addmon, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setText("Tổng tiền: ");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Order");
        jLabel4.setToolTipText("");

        xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageicon/Trash_50px.png"))); // NOI18N
        xoa.setText("Xóa order");
        xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaActionPerformed(evt);
            }
        });

        OrderTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Món", "Số lượng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        OrderTab.setEditable(false);
        jScrollPane2.setViewportView(OrderTab);
        if (OrderTab.getColumnModel().getColumnCount() > 0) {
            OrderTab.getColumnModel().getColumn(0).setPreferredWidth(200);
            OrderTab.getColumnModel().getColumn(0).setMaxWidth(200);
        }

        USER.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        USER.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageicon/Account_50px.png"))); // NOI18N
        USER.setText("user:");
        USER.setEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(USER, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(picked1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(USER, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(picked1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageicon/Cash in Hand_50px.png"))); // NOI18N
        jButton11.setText("Thanh Toán");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("Số lượng: ");

        jLabel2.setText("Món đã chọn: ");

        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });

        jLabel6.setText("Thành tiền: ");

        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageicon/Plus_50px.png"))); // NOI18N
        add.setText("Order");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(picked, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(25, 25, 25)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(money1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(picked, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(money1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(page1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(page2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(page1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(page2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO frmadd your handling code here:
        
        try {
           List<user> a = dao.daouser.getADMR(USER.getText());   
           if (a.size() > 0) {
               if(a.get(0).getAdmin().compareTo("x")==0)
               {
                 frmmenu b = new frmmenu();
//                JOptionPane.showMessageDialog(this,"dang nhap thanh cong");
                b.getContentPane().setBackground(Color.white);
                b.pack();
                b.USER.setText(a.get(0).getTaikhoan());
                b.setVisible(true);
                this.dispose();
               }
               else {                  
                    frmlogin c = new frmlogin();
                    c.getContentPane().setBackground(Color.white);
                    c.pack();
                    c.setVisible(true);
                    this.dispose();
               }
           }
        } catch (SQLException ex) {
            Logger.getLogger(quanlybanhang.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(quanlybanhang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BackActionPerformed

    private void page1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_page1ActionPerformed
        try {
            // TODO frmadd your handling code here:
            k = 1;
            LoadPage1();
            sotrang.setText("Trang " + k + "/2");
        } catch (SQLException ex) {
            Logger.getLogger(quanlybanhang.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(quanlybanhang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_page1ActionPerformed

    private void page2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_page2ActionPerformed
        try {
            k = 2;
            LoadPage2();
            sotrang.setText("Trang " + k + "/2");
        } catch (SQLException ex) {
            Logger.getLogger(quanlybanhang.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(quanlybanhang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_page2ActionPerformed

    private void addmonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addmonActionPerformed
        // TODO frmadd your handling code here:
        if (Menu1.getRowCount() < 18) {
            if (tem.getText().equals("") != true) {
                if (giam.getText().equals("") != true) {
                    if (giam.getText().matches("[0-9]+") == true) {
                        int input = JOptionPane.showConfirmDialog(null, "Thêm món " + tem.getText() + " có giá " + giam.getText() + "vnd ?", "Thêm món ", JOptionPane.YES_NO_OPTION);
                        if (input == 0) {
                            try {
                                menu _menu = new menu();
                                _menu.setTenh(tem.getText());
                                _menu.setDongia(Integer.parseInt(giam.getText()));
                                tem.setText("");
                                giam.setText("");
                                dao.daomenu.InsertMN(_menu);
                                Menu1.setRowCount(0);
                                LoadData2Table();
                                if (k == 1) {
                                    LoadPage1();
                                } else if (k == 2) {
                                    LoadPage2();
                                }
                            } catch (SQLException ex) {
                                Logger.getLogger(frmadd.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (ClassNotFoundException ex) {
                                Logger.getLogger(frmadd.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        } else {
                            return;
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Giá món không đúng!");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Chưa nhập giá món!");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Chưa nhập tên món!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Menu đã đầy!");
        }
    }//GEN-LAST:event_addmonActionPerformed

    private void m1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m1ActionPerformed
        // TODO frmadd your handling code here:
        picked.setText(m1.getText());
        money1.setText("");
        jSpinner1.setValue(1);
        for (int i = 0; i < Menu1.getRowCount(); i++) {
            if (Menu1.getValueAt(i, 0) == picked.getText()) {
                money1.setText("" + Integer.parseInt((String) Menu1.getValueAt(i, 1)));
            }
        }
    }//GEN-LAST:event_m1ActionPerformed

    private void m2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m2ActionPerformed
        // TODO frmadd your handling code here:
        picked.setText(m2.getText());
        money1.setText("");
        jSpinner1.setValue(1);
        for (int i = 0; i < Menu1.getRowCount(); i++) {
            if (Menu1.getValueAt(i, 0) == picked.getText()) {
                money1.setText("" + Integer.parseInt((String) Menu1.getValueAt(i, 1)));
            }
        }
    }//GEN-LAST:event_m2ActionPerformed

    private void m3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m3ActionPerformed
        // TODO frmadd your handling code here:
        picked.setText(m3.getText());
        money1.setText("");
        jSpinner1.setValue(1);
        for (int i = 0; i < Menu1.getRowCount(); i++) {
            if (Menu1.getValueAt(i, 0) == picked.getText()) {
                money1.setText("" + Integer.parseInt((String) Menu1.getValueAt(i, 1)));
            }
        }
    }//GEN-LAST:event_m3ActionPerformed

    private void m4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m4ActionPerformed
        // TODO frmadd your handling code here:
        picked.setText(m4.getText());
        money1.setText("");
        jSpinner1.setValue(1);
        for (int i = 0; i < Menu1.getRowCount(); i++) {
            if (Menu1.getValueAt(i, 0) == picked.getText()) {
                money1.setText("" + Integer.parseInt((String) Menu1.getValueAt(i, 1)));
            }
        }
    }//GEN-LAST:event_m4ActionPerformed

    private void m5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m5ActionPerformed
        // TODO frmadd your handling code here:
        picked.setText(m5.getText());
        money1.setText("");
        jSpinner1.setValue(1);
        for (int i = 0; i < Menu1.getRowCount(); i++) {
            if (Menu1.getValueAt(i, 0) == picked.getText()) {
                money1.setText("" + Integer.parseInt((String) Menu1.getValueAt(i, 1)));
            }
        }
    }//GEN-LAST:event_m5ActionPerformed

    private void m6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m6ActionPerformed
        // TODO frmadd your handling code here:
        picked.setText(m6.getText());
        money1.setText("");
        jSpinner1.setValue(1);
        for (int i = 0; i < Menu1.getRowCount(); i++) {
            if (Menu1.getValueAt(i, 0) == picked.getText()) {
                money1.setText("" + Integer.parseInt((String) Menu1.getValueAt(i, 1)));
            }
        }
    }//GEN-LAST:event_m6ActionPerformed

    private void m7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m7ActionPerformed
        // TODO frmadd your handling code here:
        picked.setText(m7.getText());
        money1.setText("");
        jSpinner1.setValue(1);
        for (int i = 0; i < Menu1.getRowCount(); i++) {
            if (Menu1.getValueAt(i, 0) == picked.getText()) {
                money1.setText("" + Integer.parseInt((String) Menu1.getValueAt(i, 1)));
            }
        }
    }//GEN-LAST:event_m7ActionPerformed

    private void m8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m8ActionPerformed
        // TODO frmadd your handling code here:
        picked.setText(m8.getText());
        money1.setText("");
        jSpinner1.setValue(1);
        for (int i = 0; i < Menu1.getRowCount(); i++) {
            if (Menu1.getValueAt(i, 0) == picked.getText()) {
                money1.setText("" + Integer.parseInt((String) Menu1.getValueAt(i, 1)));
            }
        }
    }//GEN-LAST:event_m8ActionPerformed

    private void m9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m9ActionPerformed
        // TODO frmadd your handling code here:
        picked.setText(m9.getText());
        money1.setText("");
        jSpinner1.setValue(1);
        for (int i = 0; i < Menu1.getRowCount(); i++) {
            if (Menu1.getValueAt(i, 0) == picked.getText()) {
                money1.setText("" + Integer.parseInt((String) Menu1.getValueAt(i, 1)));
            }
        }
    }//GEN-LAST:event_m9ActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO frmadd your handling code here:
        Vector<String> row = new Vector<>();
        if (picked.getText().equals("") != true) {
            row.addElement(picked.getText());
            row.addElement(jSpinner1.getValue().toString());
            Order1.addRow(row);
            OrderTab.setModel(Order1);
        }
        money = money + Integer.parseInt(money1.getText());
        picked1.setText("" + money + " vnd");
        picked.setText("");
        jSpinner1.setValue(1);
        money1.setText("");
    }//GEN-LAST:event_addActionPerformed

    private void xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaActionPerformed
        int j = OrderTab.getSelectedRow();
        if (j != -1) {
            for (int i = 0; i < Menu1.getRowCount(); i++) {
                if (Menu1.getValueAt(i, 0).equals(Order1.getValueAt(j, 0))) {
                    money -= (Integer.parseInt((String) Menu1.getValueAt(i, 1)) * Integer.parseInt((String) Order1.getValueAt(j, 1)));
                    Order1.removeRow(j);
                }
            }
            picked1.setText("" + money + " vnd");
            OrderTab.setModel(Order1);
        }
    }//GEN-LAST:event_xoaActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
       try {
            hoadon _hoadon = new hoadon();
            _hoadon.setTienban(money);
            dao.daohoadon.InsertHD(_hoadon);
            Order1.setColumnCount(0);
            OrderTab.setModel(Order1);
            LoadOrder();
            JOptionPane.showMessageDialog(this,"Tổng hóa đơn: "+money+" vnd \n ĐÃ ĐƯỢC THANH TOÁN");
            picked1.setText("");           
            money = 0;
        } catch (SQLException ex) {
            Logger.getLogger(quanlybanhang.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(quanlybanhang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void xoamonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoamonActionPerformed
        int m = 0;
        try {
            for (int j = 0; j < Order1.getRowCount(); j++) {
                if (picked.getText().equals(Order1.getValueAt(j, 0)) == true) {
                    m++;
                }
            }
            if (m > 0) {
                JOptionPane.showMessageDialog(this, "Mon an co !");
            } else {
                for (int i = 0; i < Menu1.getRowCount(); i++) {
                    if (Menu1.getValueAt(i, 0) == picked.getText()) {
                        menu mn1 = new menu();
                        mn1.setTenh((String) Menu1.getValueAt(i, 0));
                        dao.daomenu.DeleteMN(mn1);
                        Menu1.removeRow(i);
                    }
                }
            }
            if (k == 1) {
                LoadPage1();
            } else if (k == 2) {
                LoadPage2();
            }
            picked.setText("");
            jSpinner1.setValue(1);
            money1.setText("");
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(quanlybanhang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_xoamonActionPerformed

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        // TODO frmadd your handling code here:
        int x = (int) jSpinner1.getValue();
        if (x >= 1) {
            int y = 0;
            for (int i = 0; i < Menu1.getRowCount(); i++) {
                if (Menu1.getValueAt(i, 0) == picked.getText()) {
                    money1.setText("" + Integer.parseInt((String) Menu1.getValueAt(i, 1)) * x);
                }
            }
        } else {
            jSpinner1.setValue(1);
        }
    }//GEN-LAST:event_jSpinner1StateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(quanlybanhang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(quanlybanhang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(quanlybanhang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(quanlybanhang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new quanlybanhang().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(quanlybanhang.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(quanlybanhang.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private org.jdesktop.swingx.JXTable OrderTab;
    public javax.swing.JLabel USER;
    private javax.swing.JButton add;
    private javax.swing.JButton addmon;
    private javax.swing.JTextField giam;
    private javax.swing.JButton jButton11;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JButton m1;
    private javax.swing.JButton m2;
    private javax.swing.JButton m3;
    private javax.swing.JButton m4;
    private javax.swing.JButton m5;
    private javax.swing.JButton m6;
    private javax.swing.JButton m7;
    private javax.swing.JButton m8;
    private javax.swing.JButton m9;
    private javax.swing.JLabel money1;
    private javax.swing.JButton page1;
    private javax.swing.JButton page2;
    private javax.swing.JLabel picked;
    private javax.swing.JLabel picked1;
    private javax.swing.JLabel sotrang;
    private javax.swing.JTextField tem;
    private javax.swing.JButton xoa;
    private javax.swing.JButton xoamon;
    // End of variables declaration//GEN-END:variables
}
