import javax.swing.*;
import java.awt.*;

public class ElectroNova {

    static int total = 0;

    static String usuarioGuardado = "";
    static String contraseñaGuardada = "";

    public static void main(String[] args) {

        JFrame ventana = new JFrame("ElectroNova");
        ventana.setSize(900, 700);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BoxLayout(panelPrincipal, BoxLayout.Y_AXIS));
        panelPrincipal.setBackground(new Color(230,230,230));

        ventana.add(panelPrincipal);

        JPanel panelTitulo = new JPanel();

        panelTitulo.setBackground(new Color(44,62,80));
        panelTitulo.setMaximumSize(new Dimension(900,80));

        JLabel titulo = new JLabel("ElectroNova");

        titulo.setForeground(Color.WHITE);
        titulo.setFont(new Font("Arial", Font.BOLD, 30));

        panelTitulo.add(titulo);

        panelPrincipal.add(panelTitulo);

        panelPrincipal.add(Box.createVerticalStrut(30));

        JPanel panelLogin = new JPanel();

        panelLogin.setLayout(new BoxLayout(panelLogin, BoxLayout.Y_AXIS));
        panelLogin.setBackground(new Color(230,230,230));

        JPanel cardLogin = new JPanel();

        cardLogin.setLayout(new BoxLayout(cardLogin, BoxLayout.Y_AXIS));
        cardLogin.setBackground(Color.WHITE);

        cardLogin.setMaximumSize(new Dimension(350,260));

        cardLogin.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(200,200,200)),
                BorderFactory.createEmptyBorder(20,20,20,20)
        ));

        JLabel tituloLogin = new JLabel("Iniciar sesión");

        tituloLogin.setFont(new Font("Arial", Font.BOLD, 24));
        tituloLogin.setAlignmentX(Component.CENTER_ALIGNMENT);

        JTextField txtUsuario = new JTextField();

        txtUsuario.setMaximumSize(new Dimension(300,40));
        txtUsuario.setFont(new Font("Arial", Font.PLAIN, 16));
        txtUsuario.setBorder(BorderFactory.createTitledBorder("Usuario"));

        JPasswordField txtPass = new JPasswordField();

        txtPass.setMaximumSize(new Dimension(300,40));
        txtPass.setFont(new Font("Arial", Font.PLAIN, 16));
        txtPass.setBorder(BorderFactory.createTitledBorder("Contraseña"));

        JButton iniciar = new JButton("Iniciar sesión");

        iniciar.setBackground(new Color(52,152,219));
        iniciar.setForeground(Color.WHITE);

        JButton registrar = new JButton("Registrarse");

        registrar.setBackground(new Color(155,89,182));
        registrar.setForeground(Color.WHITE);

        cardLogin.add(tituloLogin);
        cardLogin.add(Box.createVerticalStrut(20));
        cardLogin.add(txtUsuario);
        cardLogin.add(Box.createVerticalStrut(15));
        cardLogin.add(txtPass);
        cardLogin.add(Box.createVerticalStrut(20));
        cardLogin.add(iniciar);
        cardLogin.add(Box.createVerticalStrut(15));
        cardLogin.add(registrar);

        panelLogin.add(cardLogin);

        panelPrincipal.add(panelLogin);

        JLabel mensaje = new JLabel("Registre un usuario para continuar");

        mensaje.setFont(new Font("Arial", Font.BOLD, 15));
        mensaje.setAlignmentX(Component.CENTER_ALIGNMENT);

        panelPrincipal.add(Box.createVerticalStrut(20));
        panelPrincipal.add(mensaje);

        JPanel panelCliente = new JPanel();

        panelCliente.setLayout(new BoxLayout(panelCliente, BoxLayout.Y_AXIS));
        panelCliente.setBackground(new Color(230,230,230));

        panelCliente.setVisible(false);

        panelPrincipal.add(panelCliente);

        JPanel panelAdmin = new JPanel();

        panelAdmin.setLayout(new BoxLayout(panelAdmin, BoxLayout.Y_AXIS));
        panelAdmin.setBackground(new Color(220,220,220));

        panelAdmin.setVisible(false);

        panelPrincipal.add(panelAdmin);

        DefaultListModel<String> modeloProductos = new DefaultListModel<>();

        modeloProductos.addElement("Computadora - $1200");
        modeloProductos.addElement("Lavadora - $900");
        modeloProductos.addElement("Microondas - $400");
        modeloProductos.addElement("Audifonos - $300");
        modeloProductos.addElement("Celular - $700");

        JList<String> listaProductosCliente = new JList<>(modeloProductos);

        JScrollPane scrollProductosCliente =
                new JScrollPane(listaProductosCliente);

        scrollProductosCliente.setPreferredSize(new Dimension(300,180));

        JPanel panelProductosCliente = new JPanel();

        panelProductosCliente.setBackground(new Color(230,230,230));

        panelProductosCliente.add(scrollProductosCliente);

        panelCliente.add(panelProductosCliente);

        DefaultListModel<String> modeloCarrito = new DefaultListModel<>();

        DefaultListModel<String> modeloHistorial = new DefaultListModel<>();

        JList<String> listaCarrito = new JList<>(modeloCarrito);

        JScrollPane scrollCarrito = new JScrollPane(listaCarrito);

        scrollCarrito.setPreferredSize(new Dimension(250,180));

        JList<String> listaHistorial = new JList<>(modeloHistorial);

        JScrollPane scrollHistorial = new JScrollPane(listaHistorial);

        scrollHistorial.setPreferredSize(new Dimension(250,180));

        JPanel carritoPanel = new JPanel();

        carritoPanel.setBackground(new Color(230,230,230));

        JLabel carritoTitulo = new JLabel("Carrito");

        carritoTitulo.setFont(new Font("Arial", Font.BOLD, 18));

        carritoPanel.add(carritoTitulo);

        carritoPanel.add(scrollCarrito);

        JPanel historialPanel = new JPanel();

        historialPanel.setBackground(new Color(230,230,230));

        JLabel historialTitulo = new JLabel("Historial");

        historialTitulo.setFont(new Font("Arial", Font.BOLD, 18));

        historialPanel.add(historialTitulo);

        historialPanel.add(scrollHistorial);

        carritoPanel.setVisible(false);

        historialPanel.setVisible(false);

        panelCliente.add(carritoPanel);

        panelCliente.add(historialPanel);

        JLabel totalLabel = new JLabel("Total: $0");

        totalLabel.setFont(new Font("Arial", Font.BOLD, 24));

        totalLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        panelCliente.add(Box.createVerticalStrut(15));

        panelCliente.add(totalLabel);

        JPanel botonesCliente = new JPanel();

        botonesCliente.setBackground(new Color(230,230,230));

        JButton comprar = new JButton("Agregar al carrito");

        JButton verCarrito = new JButton("Ver carrito");

        JButton verHistorial = new JButton("Ver historial");

        JButton vaciar = new JButton("Vaciar carrito");

        JButton pagar = new JButton("Comprar ahora");

        botonesCliente.add(comprar);
        botonesCliente.add(verCarrito);
        botonesCliente.add(verHistorial);
        botonesCliente.add(vaciar);
        botonesCliente.add(pagar);

        panelCliente.add(Box.createVerticalStrut(15));

        panelCliente.add(botonesCliente);

        comprar.addActionListener(e -> {

            String productoSeleccionado =
                    listaProductosCliente.getSelectedValue();

            if(productoSeleccionado == null) {

                JOptionPane.showMessageDialog(
                        null,
                        "Seleccione un producto"
                );

            } else {

                modeloCarrito.addElement(productoSeleccionado);

                modeloHistorial.addElement(
                        productoSeleccionado + " agregado"
                );

                String precioTexto =
                        productoSeleccionado.substring(
                                productoSeleccionado.indexOf("$") + 1
                        );

                int precio = Integer.parseInt(precioTexto);

                total += precio;

                totalLabel.setText("Total: $" + total);

                JOptionPane.showMessageDialog(
                        null,
                        "Producto agregado al carrito"
                );
            }
        });

        verCarrito.addActionListener(e -> {

            carritoPanel.setVisible(true);

            historialPanel.setVisible(false);
        });

        verHistorial.addActionListener(e -> {

            historialPanel.setVisible(true);

            carritoPanel.setVisible(false);
        });

        vaciar.addActionListener(e -> {

            modeloCarrito.clear();

            total = 0;

            totalLabel.setText("Total: $0");

            modeloHistorial.addElement("Carrito vaciado");
        });

        pagar.addActionListener(e -> {

            if(modeloCarrito.isEmpty()) {

                JOptionPane.showMessageDialog(
                        null,
                        "El carrito está vacío"
                );

            } else {

                String[] metodos = {
                        "Tarjeta",
                        "Nequi",
                        "PayPal",
                        "Efectivo"
                };

                String metodo =
                        (String) JOptionPane.showInputDialog(
                                null,
                                "Seleccione método de pago",
                                "Pago",
                                JOptionPane.PLAIN_MESSAGE,
                                null,
                                metodos,
                                metodos[0]
                        );

                if(metodo != null) {

                    JOptionPane.showMessageDialog(
                            null,
                            "Compra realizada con éxito usando " + metodo
                    );

                    modeloHistorial.addElement(
                            "Compra realizada con " + metodo
                    );

                    modeloCarrito.clear();

                    total = 0;

                    totalLabel.setText("Total: $0");
                }
            }
        });

        JLabel adminTitulo = new JLabel("Panel Administrador");

        adminTitulo.setFont(new Font("Arial", Font.BOLD, 24));

        adminTitulo.setAlignmentX(Component.CENTER_ALIGNMENT);

        panelAdmin.add(Box.createVerticalStrut(20));

        panelAdmin.add(adminTitulo);

        panelAdmin.add(Box.createVerticalStrut(20));

        JList<String> listaProductosAdmin = new JList<>(modeloProductos);

        JScrollPane scrollAdmin =
                new JScrollPane(listaProductosAdmin);

        scrollAdmin.setPreferredSize(new Dimension(350,200));

        JPanel adminProductos = new JPanel();

        adminProductos.setBackground(new Color(220,220,220));

        adminProductos.add(scrollAdmin);

        panelAdmin.add(adminProductos);

        JPanel herramientasAdmin = new JPanel();

        herramientasAdmin.setBackground(new Color(220,220,220));

        JTextField txtProducto = new JTextField(10);

        JTextField txtPrecio = new JTextField(6);

        JButton agregarProducto = new JButton("Agregar producto");

        JButton eliminarProducto = new JButton("Eliminar producto");

        herramientasAdmin.add(new JLabel("Producto"));
        herramientasAdmin.add(txtProducto);

        herramientasAdmin.add(new JLabel("Precio"));
        herramientasAdmin.add(txtPrecio);

        herramientasAdmin.add(agregarProducto);
        herramientasAdmin.add(eliminarProducto);

        panelAdmin.add(herramientasAdmin);

        agregarProducto.addActionListener(e -> {

            String nombre = txtProducto.getText();

            String precio = txtPrecio.getText();

            if(!nombre.isEmpty() && !precio.isEmpty()) {

                modeloProductos.addElement(
                        nombre + " - $" + precio
                );

                txtProducto.setText("");

                txtPrecio.setText("");
            }
        });

        eliminarProducto.addActionListener(e -> {

            int index = listaProductosAdmin.getSelectedIndex();

            if(index != -1) {

                modeloProductos.remove(index);
            }
        });

        JButton cerrarSesionCliente =
                new JButton("Cerrar sesión");

        cerrarSesionCliente.addActionListener(e -> {

            panelCliente.setVisible(false);

            panelLogin.setVisible(true);

            carritoPanel.setVisible(false);

            historialPanel.setVisible(false);

            txtUsuario.setText("");

            txtPass.setText("");

            mensaje.setText("Sesión cerrada correctamente");
        });

        panelCliente.add(Box.createVerticalStrut(15));

        panelCliente.add(cerrarSesionCliente);

        JButton cerrarSesionAdmin =
                new JButton("Cerrar sesión");

        cerrarSesionAdmin.addActionListener(e -> {

            panelAdmin.setVisible(false);

            panelLogin.setVisible(true);

            txtUsuario.setText("");

            txtPass.setText("");

            mensaje.setText("Sesión cerrada correctamente");
        });

        panelAdmin.add(Box.createVerticalStrut(20));

        panelAdmin.add(cerrarSesionAdmin);

        registrar.addActionListener(e -> {

            String nombre = txtUsuario.getText();

            String pass = new String(txtPass.getPassword());

            if(nombre.isEmpty() || pass.isEmpty()) {

                JOptionPane.showMessageDialog(
                        null,
                        "Complete todos los campos"
                );

            } else {

                usuarioGuardado = nombre;

                contraseñaGuardada = pass;

                mensaje.setText(
                        "Usuario registrado correctamente"
                );

                JOptionPane.showMessageDialog(
                        null,
                        "Cuenta registrada exitosamente"
                );

                txtUsuario.setText("");

                txtPass.setText("");
            }
        });

        iniciar.addActionListener(e -> {

            String nombre = txtUsuario.getText();

            String pass = new String(txtPass.getPassword());

            if(nombre.equals("admin")
                    && pass.equals("1234")) {

                mensaje.setText(
                        "Bienvenido Administrador"
                );

                panelAdmin.setVisible(true);

                panelCliente.setVisible(false);

                panelLogin.setVisible(false);

            } else if(nombre.isEmpty()
                    || pass.isEmpty()) {

                JOptionPane.showMessageDialog(
                        null,
                        "Ingrese usuario y contraseña"
                );

            } else if(usuarioGuardado.isEmpty()) {

                JOptionPane.showMessageDialog(
                        null,
                        "Primero debes registrar una cuenta"
                );

            } else if(nombre.equals(usuarioGuardado)
                    && pass.equals(contraseñaGuardada)) {

                mensaje.setText(
                        "Bienvenido " + nombre
                );

                panelCliente.setVisible(true);

                panelAdmin.setVisible(false);

                panelLogin.setVisible(false);

            } else {

                JOptionPane.showMessageDialog(
                        null,
                        "Usuario o contraseña incorrectos"
                );
            }
        });

        ventana.setLocationRelativeTo(null);

        ventana.setVisible(true);
    }
}