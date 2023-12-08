package application;

import components.Button;
import components.ErrorPopUp;
import components.SuccessPopUp;
import configs.BasicConfigs;
import entities.Order;
import entities.Restaurant;
import entities.Status;
import entities.User;
import screens.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;

public class App extends JFrame {
    // LISTS
    ArrayList<Restaurant> rests = new ArrayList<>();
    ArrayList<User> users = new ArrayList<>();
    ArrayList<Order> orders = new ArrayList<>();

    // SCREENS
    Login login = new Login(users, Color.decode("#CC0000"));
    Shopping shopping = new Shopping(rests, orders,Color.decode("#CC0000"));
    ShoppingCart cart = new ShoppingCart(rests, orders, Color.decode("#CC0000"));
    RegisterUser registerUser = new RegisterUser(Color.decode("#CC0000"));
    Quietus quietus = new Quietus(Color.decode("#CC0000"));
    RegisterRest registerRest = new RegisterRest(rests, Color.decode("#CC0000"));
    RegisterFood registerFood = new RegisterFood(rests, Color.decode("#CC0000"));
    Sidebar sidebar = new Sidebar(Color.decode("#990000"));

    // COMPONENTS
    BasicConfigs bc = new BasicConfigs();
    Button logar = new Button("Entrar");
    Button voltarLogar = new Button("Voltar");
    Button voltarResLogar = new Button("Sair");
    Button voltarFoodLogar = new Button("Sair");
    Button registerU = new Button("Registar");
    Button registerR = new Button("Cadastrar Restaurante");

    Button registerF = new Button("Cadastrar Comida");
    Button shoppingButton = new Button("Comprar");
    Button registerUserButton = new Button("Registrar Usuário");
    Button registerRestButton = new Button("Registrar Restaurante");
    Button registerFoodButton = new Button("Registrar Comida");
    Button deslogar = new Button("Sair");
    Button carrinho = new Button("Carrinho");
    Button comprar = new Button("Finalizar");
    Button voltar = new Button("Voltar");
    Button ok = new Button("OK");

    JPanel menu = new JPanel();


    // IDS
    int idRes = 0;
    int idUser = 0;
    public ArrayList<Restaurant> getRestaurants() {
        return rests;
    }

    public ArrayList<Order> getPedidos() {
        return orders;
    }

    private Restaurant getRestaurant(String rest){
        for (Restaurant restaurant: rests){
            if (Objects.equals(restaurant.getName(), rest)){
                return restaurant;
            }
        }
        return null;
    }
    public App(String title){
        super(title);
        setContentPane(login);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(950,800);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);

        // Register
        voltarLogar.setBounds(10, 10 , 100, 50);
        registerUserButton.setBounds(390, 520, 150, 50);
        registerUserButton.setBackground(Color.white);

        // Login
        logar.setBounds(280, 400, 150, 50);
        logar.setBackground(Color.white);
        registerU.setBounds(470, 400,150,50);
        registerU.setBackground(Color.white);

        // Sidebar
        registerR.setBounds(0, 10, 150, 50);
        registerR.setBackground(Color.decode("#660000"));
        registerR.setForeground(Color.white);

        registerF.setBounds(0, 70, 150, 50);
        registerF.setBackground(Color.decode("#660000"));
        registerF.setForeground(Color.white);

        shoppingButton.setBounds(0, 130, 150, 50);
        shoppingButton.setBackground(Color.decode("#660000"));
        shoppingButton.setForeground(Color.white);

        //SHOPPING
        deslogar.setBounds(10,10,100,50);
        carrinho.setBounds(675,10,100,50);

        //cart
        comprar.setBounds(825, 10, 100, 50);
        voltar.setBounds(10, 10, 100, 50);

        //QUIETUS
        ok.setBounds(350, 500, 100, 50);

        //REGISTRAR RESTAURANT
        registerRestButton.setBounds(250, 420, 300, 50);
        voltarResLogar.setBounds(10, 10 , 100, 50);

        //REGISTRAR COMIDA
        registerFoodButton.setBounds(250, 420, 300, 50);
        voltarFoodLogar.setBounds(10, 10 , 100, 50);

        addBasicConfigsRestaurants();
        addBasicConfigsUsers();
        addRoutes();

        // REGISTRAR
        registerUser.add(voltarLogar);
        registerUser.add(registerUserButton);

        // ENTRAR
        login.add(logar);
        login.add(registerU);

        // MENU LATERAL
        sidebar.add(registerR);
        sidebar.add(registerF);
        sidebar.add(shoppingButton);

        // LOJA
        shopping.add(deslogar);
        shopping.add(carrinho);

        // CARRINHO
        cart.add(voltar);
        cart.add(comprar);

        // QUIETUS
        quietus.add(ok);


        // REGISTRAR RESTAURANTE
        registerRest.add(registerRestButton);
        registerRest.add(voltarResLogar);

        // REGISTRAR COMIDA
        registerFood.add(registerFoodButton);
        registerFood.add(voltarFoodLogar);

        // MENU
        menu.setBounds(0, 0, 950, 800);
        menu.setLayout(null);

        setVisible(true);
    }

    public boolean isAlpha(String name) {
        char[] chars = name.toCharArray();

        for (char c : chars) {
            if (c == ' '){
                continue;
            }
            if(!Character.isLetter(c)) {
                return true;
            }
        }

        return false;
    }

    public boolean cadastrarRestaurante(String nome, int x, int y, boolean showMessage){
        for (Restaurant rest : rests){
            if (Objects.equals(nome, rest.getName()) || isAlpha(nome)){
                new ErrorPopUp("ATENTITON","It already has a restaurant with this name, or is invalid");
                return false;
            }
        }
        rests.add(new Restaurant(idRes, nome, x, y));
        idRes += 1;
        if (showMessage){
            bc.addRestaurant(nome, x, y);
            new SuccessPopUp("Success", "Restaurant ["+nome+"] was created!\nNow add new foods!!!");
        }
        return true;
    }
    public boolean cadastrarUsers(String nome, String CPF, int x, int y, Status status, boolean showMessage){
        for (User user : users){
            if (Objects.equals(nome, user.getName()) || isAlpha(nome)){
                new ErrorPopUp("ATENTITON","It already has a User with this name, or is invalid");
                return false;
            }
        }
        if (registerUser.admLogin()){
            users.add(new User(idUser, nome, CPF, x,y, status));
        }else{
            users.add(new User(idUser, nome, CPF, x,y));
        }
        idUser += 1;
        if (showMessage){
            bc.addUser(nome,CPF,x,y,status);
            new SuccessPopUp("Success", "["+nome+"] you create your account");
        }
        return true;
    }

    private void addRoutes(){
        // ACTUALLY AN ACTION
        registerUserButton.addActionListener(e ->{
            if (cadastrarUsers(registerUser.getNome(), registerUser.getCpf(),Integer.parseInt(registerUser.getXL()),Integer.parseInt(registerUser.getYL()), registerUser.getRole(), true)){
                registerUser.clean();
                voltarLogar.doClick();
            }
        });
        registerRestButton.addActionListener(e ->{
            if (cadastrarRestaurante(registerRest.getNome(), registerRest.getX(), registerRest.getX(), true)){
                registerRest.clean();
                registerF.doClick();
                registerFood.getLastRestaurant();
            }
        });
        registerFoodButton.addActionListener(e ->{
            if (registerFood.getRestaurant().adicionarLanche(registerFood.getFoodName(), registerFood.getFoodPrice(), true)){
                registerFood.clean();
            }
        });
        // LOGIN -> REGISTER
        registerU.addActionListener(e -> {
            login.login();
            login.setVisible(false);

            registerUser.setUser(login.getLoggedUser());
            registerUser.setVisible(true);
            setContentPane(registerUser);
        });
        // REGISTER RESTAURANT
        registerR.addActionListener(e -> {
            if(!login.login()){
                return;
            }
            if (login.getLoggedUser().getRole() != Status.ADM){
                return;
            }
            menu.removeAll();

            registerRest.setVisible(true);

            registerRest.setBounds(150, 0, 800, 800);

            sidebar.setVisible(true);

            menu.add(registerRest);
            menu.add(sidebar);

            setContentPane(menu);
        });
        // REGISTER FOOD
        registerF.addActionListener(e -> {
            if(!login.login()){
                return;
            }
            if (login.getLoggedUser().getRole() != Status.ADM){
                return;
            }
            menu.removeAll();

            registerFood.setRestaurants(getRestaurants());
            registerFood.refresh();
            registerFood.setVisible(true);

            registerFood.setBounds(150, 0, 800, 800);
            sidebar.setVisible(true);

            menu.add(registerFood);
            menu.add(sidebar);

            setContentPane(menu);
        });
        // SHOPPING
        shoppingButton.addActionListener(e -> {
            if(!login.login()){
                return;
            }
            shopping.setAllRequests(getPedidos());
            shopping.cleanFood();
            shopping.setAllRestaurants(getRestaurants());
            shopping.setUser(login.getLoggedUser());
            shopping.refresh();
            shopping.setVisible(true);
            shopping.setBounds(150, 0, 800, 800);
            sidebar.setVisible(true);

            menu.removeAll();

            menu.add(shopping);
            menu.add(sidebar);

            setContentPane(menu);
        });
        // REGISTER RESTAURANT -> LOGIN
        voltarResLogar.addActionListener(e->{
            registerRest.setVisible(false);

            login.setVisible(true);
            setContentPane(login);
        });
        // REGISTER COMIDA -> LOGIN
        voltarFoodLogar.addActionListener(e->{
            registerFood.setVisible(false);

            login.setVisible(true);
            setContentPane(login);
        });
        // REGISTER -> LOGIN
        voltarLogar.addActionListener(e -> {
            registerUser.setVisible(false);

            login.setVisible(true);
            setContentPane(login);
        });
        // LOGIN -> SHOPPING
        logar.addActionListener(e -> {
            if(!login.login()){
                return;
            }
            login.setVisible(false);

            shopping.setAllRequests(getPedidos());
            shopping.cleanFood();
            shopping.setAllRestaurants(getRestaurants());
            shopping.setUser(login.getLoggedUser());
            shopping.refresh();
            shopping.setVisible(true);
            shopping.setBounds(150, 0, 800, 800);
            sidebar.setVisible(true);

            menu.removeAll();

            menu.add(shopping);
            menu.add(sidebar);

            setContentPane(menu);

        });
        // SHOPPING -> LOGIN
        deslogar.addActionListener(e ->{
            shopping.setVisible(false);

            login.setVisible(true);
            setContentPane(login);
        });
        // SHOPPING -> CART
        carrinho.addActionListener(e ->{
            shopping.setVisible(false);
            shopping.setDefaultPrices();

            cart.setUser(login.getLoggedUser());
            cart.setAllRestaurants(getRestaurants());
            cart.setAllRequests(getPedidos());
            cart.updateRequests();
            cart.updatePrice();
            cart.setVisible(true);
            setContentPane(cart);
        });
        // CART -> QUIETUS
        comprar.addActionListener(e -> {
            if (cart.getModelRequests().isEmpty()){
                return;
            }
            cart.setVisible(false);

            quietus.setModelQuietus(cart.getModelRequests());
            bc.addOrder(cart.getAllRequests());
            quietus.refresh();
            quietus.setVisible(true);
            setContentPane(quietus);
        });
        // CART -> SHOPPING
        voltar.addActionListener(e ->{
            cart.setVisible(false);

            shopping.cleanFood();
            shopping.updateRequests();
            shopping.updatePrice();
            shopping.setVisible(true);
            sidebar.setVisible(true);

            menu.removeAll();

            menu.add(shopping);
            menu.add(sidebar);

            setContentPane(menu);
        });
        // QUIETUS -> CART
        ok.addActionListener(e->{
            quietus.setVisible(false);

            cart.finishShopping();
            cart.setVisible(true);
            setContentPane(cart);
        });

    }

    private void addBasicConfigsRestaurants(){
        ArrayList<String> restaurants = bc.getRests();
        for (String restaurant : restaurants){
            String[] rest = restaurant.split("-")[0].split(",");
            cadastrarRestaurante(rest[0], Integer.parseInt(rest[1]), Integer.parseInt(rest[2]), false);
            try {
                String[] foods = restaurant.split("-")[1].split(";");
                for (String food : foods){
                    String[] f = food.split(",");
                    Restaurant r = getRestaurant(rest[0]);
                    if (r == null){
                        break;
                    }
                    r.adicionarLanche(f[0],Float.parseFloat(f[1]), false);
                }
            }catch (ArrayIndexOutOfBoundsException e){
                break;
            }
        }
    }
    private void addBasicConfigsUsers(){
        ArrayList<String> users = bc.getUsers();
        for (String user : users){
            if (Objects.equals(user, "")){
                continue;
            }
            String[] u = user.replace(";","").split(",");
            if (Status.valueOf(u[4]) == Status.ADM){
                this.users.add(new User(idUser, u[0], u[1], Integer.parseInt(u[2]), Integer.parseInt(u[3]), Status.ADM));
                idUser++;
            }else{
                cadastrarUsers(u[0], u[1], Integer.parseInt(u[2]), Integer.parseInt(u[3]), Status.valueOf(u[4]), false);
            }
        }
    }

}
