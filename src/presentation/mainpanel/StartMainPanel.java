package presentation.mainpanel;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import presentation.PanelManager;

public class StartMainPanel extends JPanel {
    
    protected PanelManager panelManager;
    private JButton promotersButton;

    public StartMainPanel(PanelManager panelManager) {
        this.panelManager = panelManager;
        initializePanel();
    }

    // Here would be the different tables

    public void initializePanel() {
        setLayout(new FlowLayout());
        promotersButton = new JButton("Promoters");
        add(promotersButton);
        promotersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelManager.showPromoterList();
            }
        });
    }

}