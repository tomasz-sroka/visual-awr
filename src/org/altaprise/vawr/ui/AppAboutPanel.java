package org.altaprise.vawr.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.LayoutManager;

import java.awt.Rectangle;

import javax.swing.JEditorPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import org.altaprise.vawr.utils.SessionMetaData;

public class AppAboutPanel extends JPanel {
    private JEditorPane jEditorPane1 = new JEditorPane();
    private JScrollPane jScrollPane1 = new JScrollPane(jEditorPane1);
    private BorderLayout bl = new BorderLayout();

    public AppAboutPanel() {
        super();
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public AppAboutPanel(boolean b) {
        super(b);
    }

    public AppAboutPanel(LayoutManager layoutManager) {
        super(layoutManager);
    }

    public AppAboutPanel(LayoutManager layoutManager, boolean b) {
        super(layoutManager, b);
    }

    private void jbInit() throws Exception {
        this.setLayout(bl);
        jEditorPane1.setEditable(false);

        this.add(jScrollPane1, null);
        String readmeFilePath = "file:///";
        readmeFilePath += System.getProperty("user.dir");
        readmeFilePath += "/vawr-readme.html";
        System.out.println(readmeFilePath);
        jEditorPane1.setPage(readmeFilePath);
    }
}
