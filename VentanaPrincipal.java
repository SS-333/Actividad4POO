package Personas;

import javax.swing.*;
import java.awt.event.*;

public class VentanaPrincipal {
    private final ListaPersonas lista = new ListaPersonas();
    private final DefaultListModel modelo = new DefaultListModel<>();
    ImageIcon img = new ImageIcon("Personas/icon.png");
    private String id;
    private String nombre;
    private String apellidos;
    private String telefono;
    private String direccion;
    private JPanel frmPrincipal;
    private JTextField txtId, txtNombre, txtApellidos, txtTelefono, txtDireccion;
    private JList listaNombres;
    private JButton btnAgregar, btnEliminarPersona, btnBorrarLista;

    public VentanaPrincipal() {
        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settingInfo();
                agregarPersona(id, nombre, apellidos, telefono, direccion);
            }
        });
        btnEliminarPersona.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eliminarPersona(listaNombres.getSelectedIndex());
            }
        });
        btnBorrarLista.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lista.borrarLista();
                modelo.removeAllElements();
            }
        });
    }

    public void loadForm() {
        JFrame f = new JFrame("Personas");
        f.setContentPane(new VentanaPrincipal().frmPrincipal);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setResizable(false);
        f.setIconImage(img.getImage());
    }

    private void agregarPersona(String id, String nombre, String apellidos,
                                String telefono, String direccion) {
        Persona p = new Persona(id, nombre, apellidos, telefono, direccion);
        lista.agregarPersona(p);
        String elemento = id + " - " + nombre + " " + apellidos +
                " - " + telefono + " - " + direccion;
        modelo.addElement(elemento);
        listaNombres.setModel(modelo);
        clearForm();
    }

    private void eliminarPersona(int index) {
        if (index >= 0) {
            modelo.removeElementAt(index);
            lista.eliminarPersona(index);
        } else {
            JOptionPane.showMessageDialog(frmPrincipal, "Debe seleccionar un elemento",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void settingInfo() {
        this.id = txtId.getText().trim();
        this.nombre = txtNombre.getText().trim();
        this.apellidos = txtApellidos.getText().trim();
        this.telefono = txtTelefono.getText().trim();
        this.direccion = txtDireccion.getText().trim();
    }

    private void clearForm() {
        txtId.setText("");
        txtNombre.setText("");
        txtApellidos.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");
    }
}
