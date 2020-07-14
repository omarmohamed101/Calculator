package resiz;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;


public class Layout extends JFrame implements ItemListener{
	
	private JPanel container, option, nums,sbutns,butns,scientificpanel,screenpanel;
	private static JTextField screen;
	private JMenu file, help;
	private JMenuBar menu;
	private JButton del,clr,one,two,three,four,five,six,seven,eight,nine,zero,plus,minus,divide,mult,dot,sign,ans,exit;
	private JCheckBox Scientific;
	private JButton sq2,cub,pow,inv,rpa,lpa,rot,rot2,rot3,fact,sin,cos,tan,exp,asin,acos,atan,comp,perm,log,sinh,cosh,tanh,log10,pi;
	
	public Layout() {
		super("Calculator");
		//colors
		//Color White = new Color(255, 255, 255);
		Color blue1 = new Color(180, 208, 253);
		Color blue2 = new Color(104, 161, 252);
		Color blue3 = new Color(51, 79, 125);
		//Fonts
		Font font1 = new Font("SansSerif", Font.PLAIN, 30);

		
		sbutns = new JPanel();
		butns = new JPanel();
		container = new JPanel();
		screenpanel = new JPanel();
		
		Scientific = new JCheckBox("Scientific");
		scientificpanel = new JPanel();
		scientificpanel.setLayout(new BoxLayout(scientificpanel, BoxLayout.X_AXIS));
		scientificpanel.add(Scientific);
		scientificpanel.add(Box.createHorizontalGlue());
		scientificpanel.setBackground(null);
		Scientific.setBackground(null);

		
		option = new JPanel();
		nums = new JPanel();
		file = new JMenu("File");
		help = new JMenu("Help");
		menu = new JMenuBar();
		menu.add(file);
		menu.add(help);
		menu.add(Box.createHorizontalGlue());
		menu.setLayout(new BoxLayout(menu, BoxLayout.X_AXIS));

		screen = new JTextField("");
                //restrict the user to use the numeric keyboard
                screen.addKeyListener(new KeyAdapter() {
                public void keyPressed(KeyEvent ke) {
                    if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') {
                        screen.setEditable(true);
                    } else {
                        screen.setEditable(false); 
                   }
                }
                });
		screen.setEditable(true);
		screen.setFont(font1);
		screen.setPreferredSize(new Dimension(330, 40));
		screenpanel.add(screen);
		screenpanel.setBackground(null);
		

		
		del = new JButton("DEL");
		clr = new JButton("CLR");
		ans = new JButton("ANS");
		exit = new JButton("EXIT");
		
		del.setPreferredSize(new Dimension(80, 40));
		clr.setPreferredSize(new Dimension(80, 40));
		ans.setPreferredSize(new Dimension(80, 40));
		exit.setPreferredSize(new Dimension(80, 40));
		
		one = new JButton("1");
		two = new JButton("2");
		three = new JButton("3");
		four = new JButton("4");
		five = new JButton("5");	
		six = new JButton("6");
		seven = new JButton("7");
		eight = new JButton("8");
		nine = new JButton("9");
		zero = new JButton("0");
		plus = new JButton("+");
		minus = new JButton("-");
		mult = new JButton("*");
		divide = new JButton("/");
		sign = new JButton("-/+");
		minus = new JButton("-");
		dot = new JButton(".");
		
		
		one.setPreferredSize(new Dimension(60, 60));
		
		
		sq2 = new JButton("X^2");
		cub = new JButton("X^3");
		pow = new JButton("X^y");
		inv = new JButton("1/X");
		lpa = new JButton("(");
		
		rot = new JButton("root");
		rot2 = new JButton("root3");
		rot3 = new JButton("root3");
		fact = new JButton("n!");
		rpa = new JButton(")");
		
		sin = new JButton("sin");
		cos = new JButton("cos");
		tan = new JButton("tan");
		exp = new JButton("exp");
		perm = new JButton("nPr");
		
		asin = new JButton("asin");
		acos = new JButton("acos");
		atan = new JButton("atan");
		log = new JButton("log");
		comp = new JButton("nCr");
		
		sinh = new JButton("sinh");
		cosh = new JButton("cosh");
		tanh = new JButton("tanh");
		log10 = new JButton("log10");
		pi = new JButton("PI");
		
		
		sbutns.add(sq2);
		sbutns.add(cub);
		sbutns.add(pow);
		sbutns.add(inv);
		sbutns.add(lpa);
		sbutns.add(rot);
		sbutns.add(rot2);
		sbutns.add(rot3);
		sbutns.add(fact);
		sbutns.add(rpa);
		sbutns.add(sin);
		sbutns.add(cos);
		sbutns.add(tan);
		sbutns.add(exp);
		sbutns.add(perm);
		sbutns.add(asin);
		sbutns.add(acos);
		sbutns.add(atan);
		sbutns.add(log);
		sbutns.add(comp);
		sbutns.add(sinh);
		sbutns.add(cosh);
		sbutns.add(tanh);
		sbutns.add(log10);
		sbutns.add(pi);
		sbutns.setLayout(new GridLayout(5,5,10,10));
		sbutns.setBackground(blue1);
		sbutns.setBorder(BorderFactory.createLineBorder(blue1, 15));

		option.setLayout(new BoxLayout(option, BoxLayout.X_AXIS));

		option.add(del);
		option.add(Box.createRigidArea(new Dimension(10, 0)));
		option.add(clr);
		option.add(Box.createHorizontalGlue());
		option.add(ans);
		option.add(Box.createRigidArea(new Dimension(10, 0)));
		option.add(exit);
		option.setBackground(blue3);
		option.setBorder(BorderFactory.createLineBorder(blue3, 15));
		
		nums.add(seven);
		nums.add(eight);
		nums.add(nine);
		nums.add(plus);
		nums.add(four);
		nums.add(five);
		nums.add(six);
		nums.add(minus);
		nums.add(one);
		nums.add(two);
		nums.add(three);
		nums.add(mult);
		nums.add(zero);
		nums.add(dot);
		nums.add(sign);
		nums.add(divide);
		nums.setLayout(new GridLayout(4, 3,10,10));
		nums.setBackground(blue1);
		nums.setBorder(BorderFactory.createLineBorder(blue1, 15));
		
		butns.setBackground(null);
		butns.add(Box.createRigidArea(new Dimension(70, 0)));
		butns.add(nums);	
		butns.add(Box.createRigidArea(new Dimension(100, 0)));
		butns.add(sbutns);
		butns.add(Box.createRigidArea(new Dimension(70, 0)));
		butns.setLayout(new BoxLayout(butns, BoxLayout.X_AXIS));
		
		container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
		container.setBackground(blue2);
		container.add(menu);
		container.add(Box.createRigidArea(new Dimension(0, 10)));
		container.add(screenpanel);
		container.add(Box.createRigidArea(new Dimension(0, 10)));
		container.add(option);
		container.add(Box.createRigidArea(new Dimension(0, 30)));
		container.add(butns);
		container.add(Box.createRigidArea(new Dimension(0, 30)));
		container.add(scientificpanel);
		add(container);
		
		Scientific.addItemListener(this);
		setSize(400,500);
                
                zero.addActionListener(new dicp(zero.getActionCommand()));
                one.addActionListener(new dicp(one.getActionCommand()));
                two.addActionListener(new dicp(two.getActionCommand()));
                three.addActionListener(new dicp(three.getActionCommand()));
                four.addActionListener(new dicp(four.getActionCommand()));
                five.addActionListener(new dicp(five.getActionCommand()));
                six.addActionListener(new dicp(six.getActionCommand()));
                seven.addActionListener(new dicp(seven.getActionCommand()));
                eight.addActionListener(new dicp(eight.getActionCommand()));
                nine.addActionListener(new dicp(nine.getActionCommand()));
                
                del.addActionListener(new del());
                clr.addActionListener(new clr());
                plus.addActionListener(new dicp(plus.getActionCommand()));
                minus.addActionListener(new dicp(minus.getActionCommand()));
                divide.addActionListener(new dicp(divide.getActionCommand()));
                mult.addActionListener(new dicp(mult.getActionCommand()));
                dot.addActionListener(new dicp(dot.getActionCommand()));
                sign.addActionListener(new dicp(minus.getActionCommand()));
                pi.addActionListener(new dicp(pi.getActionCommand()));
                ans.addActionListener(new evaluate());
                exit.addActionListener(new exit());
                
                rpa.addActionListener(new dicp(rpa.getActionCommand()));
                lpa.addActionListener(new dicp(lpa.getActionCommand()));
                
                sin.addActionListener(new dicpTriangular(sin.getActionCommand()));
                cos.addActionListener(new dicpTriangular(cos.getActionCommand()));
                tan.addActionListener(new dicpTriangular(tan.getActionCommand()));
                asin.addActionListener(new dicpTriangular(asin.getActionCommand()));
                acos.addActionListener(new dicpTriangular(acos.getActionCommand()));
                atan.addActionListener(new dicpTriangular(atan.getActionCommand()));
                sinh.addActionListener(new dicpTriangular(sinh.getActionCommand()));
                cosh.addActionListener(new dicpTriangular(cosh.getActionCommand()));
                tanh.addActionListener(new dicpTriangular(tanh.getActionCommand()));
                fact.addActionListener(new dicpFact(fact.getActionCommand()));
                sq2.addActionListener(new dicpsq2(sq2.getActionCommand()));
                cub.addActionListener(new dicpcbe(cub.getActionCommand()));
                pow.addActionListener(new dicpPowery(pow.getActionCommand()));
                exp.addActionListener(new dicpExp(exp.getActionCommand()));
                rot.addActionListener(new dicpSqrt(rot.getActionCommand()));
                rot2.addActionListener(new dicpCbrt(rot2.getActionCommand()));
                log.addActionListener(new dicpTriangular(log.getActionCommand()));
                log10.addActionListener(new dicpTriangular(log10.getActionCommand()));
                comp.addActionListener(new dicpc(comp.getActionCommand()));
                perm.addActionListener(new dicpp(perm.getActionCommand()));
                inv.addActionListener(new dicpinverce());
                rot3.addActionListener(new dicpnthrt());
                
	}
	
		
        public void itemStateChanged(ItemEvent e) {
                if(Scientific.isSelected()){
                        this.setSize(900, 500);
                        screen.setPreferredSize(new Dimension(830, 40));
                }else {
                        this.setSize(400, 500);
                        screen.setPreferredSize(new Dimension(330, 40));

                }
        }

        private class dicp implements ActionListener  {
            String buttonTag;
            
            public dicp(String s) {
                buttonTag = s;
            }

            public void actionPerformed(ActionEvent event) {
                // clear the window if there is another expression calculated
                for (int i = 0; i < screen.getText().length(); i++) {
                    if (screen.getText().charAt(i) == '='){
                        String s = buttonTag;
                        screen.setText(s);
                        return;
                    }
                }
                String s = screen.getText() + buttonTag;
                screen.setText(s);

            }
        }
        private class dicpnthrt implements ActionListener  {
            
        	
            public void actionPerformed(ActionEvent event) {
                for (int i = 0; i < screen.getText().length(); i++) {
                    if (screen.getText().charAt(i) == '='){
                        String s = "nthrt(";
                        screen.setText(s);
                        return;
                    }   
                }
                String s = screen.getText() + "nthrt(";
                screen.setText(s);
            }
        }
        
        private class dicpinverce implements ActionListener  {
            
            
            public void actionPerformed(ActionEvent event) {
                
                String s = screen.getText() + "^(-1";
                screen.setText(s);

            }
        }
        
        private class dicpTriangular implements ActionListener  {
            String buttonTag;
            
            public dicpTriangular(String s) {
                buttonTag = s;
            }

            public void actionPerformed(ActionEvent event) {
                for (int i = 0; i < screen.getText().length(); i++) {
                    if (screen.getText().charAt(i) == '='){
                        String s = buttonTag + '(';
                        screen.setText(s);
                        return;
                    }
                }
                String s = screen.getText() + buttonTag + '(';
                screen.setText(s);

            }
        }
        private class dicpFact implements ActionListener  {
            String buttonTag;
            
            public dicpFact(String s) {
                buttonTag = s;
            }
            public void actionPerformed(ActionEvent event) {
                String s = screen.getText() + "!";
                screen.setText(s);
            }
        }
        private class dicpExp implements ActionListener  {
            String buttonTag;
            
            public dicpExp(String s) {
                buttonTag = s;
            }
            public void actionPerformed(ActionEvent event) {
                String s = screen.getText() + "e";
                screen.setText(s);
            }
        }
        private class dicpc implements ActionListener  {
            String buttonTag;
            
            public dicpc(String s) {
                buttonTag = s;
            }
            public void actionPerformed(ActionEvent event) {
                String s = screen.getText() + "C";
                screen.setText(s);
            }
        }
        private class dicpp implements ActionListener  {
            String buttonTag;
            
            public dicpp(String s) {
                buttonTag = s;
            }
            public void actionPerformed(ActionEvent event) {
                String s = screen.getText() + "p";
                screen.setText(s);
            }
        }

        private class dicpsq2 implements ActionListener  {
            String buttonTag;
            
            public dicpsq2(String s) {
                buttonTag = s;
            }
            
            public void actionPerformed(ActionEvent event) {
                String s = screen.getText() + "^(2)";
                screen.setText(s);
            }
        }
        
        private class dicpcbe implements ActionListener  {
            String buttonTag;
            
            public dicpcbe(String s) {
                buttonTag = s;
            }
            public void actionPerformed(ActionEvent event) {
                String s = screen.getText() + "^(3)";
                screen.setText(s);
            }
        }
        private class dicpSqrt implements ActionListener  {
            String buttonTag;
            
            public dicpSqrt(String s) {
                buttonTag = s;
            }
            public void actionPerformed(ActionEvent event) {
                for (int i = 0; i < screen.getText().length(); i++) {
                    if (screen.getText().charAt(i) == '='){
                        String s = "sqrt(";
                        screen.setText(s);
                        return;
                    }
                }
                String s = screen.getText() + "sqrt(";
                screen.setText(s);
            }
        }
        private class dicpCbrt implements ActionListener  {
            String buttonTag;
            
            public dicpCbrt(String s) {
                buttonTag = s;
            }
            public void actionPerformed(ActionEvent event) {
                for (int i = 0; i < screen.getText().length(); i++) {
                    if (screen.getText().charAt(i) == '='){
                        String s = "cbrt(";
                        screen.setText(s);
                        return;
                    }
                }
                String s = screen.getText() + "cbrt(";
                screen.setText(s);
            }
        }
        private class dicpPowery implements ActionListener  {
            String buttonTag;
            
            public dicpPowery(String s) {
                buttonTag = s;
            }
            public void actionPerformed(ActionEvent event) {
                String s = screen.getText() + "^(";
                screen.setText(s);
            }
        }
        
        
        
        public Object engine(String s) throws ScriptException{
            ScriptEngineManager mgr = new ScriptEngineManager();
            //ScriptEngine engine = mgr.getEngineByName("JavaScript");
            ScriptEngine engine = mgr.getEngineByName("js");
            return engine.eval(fina(s));
        }
        private class evaluate implements ActionListener {
            public void actionPerformed(ActionEvent event) {
                try {
                    Object  x = engine(Layout.screen.getText());
                    Layout.screen.setText(Layout.screen.getText() + " = " + x);
                } catch (Exception x){screen.setText("Math error");}
            }
        }
        
        public String sinh(String s){
            String exp = "";
            int counter = 0;
            int position = 0;
            for ( int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 's' && s.charAt(i + 3) == 'h') {
                    position = i + 5;
                    for (int j = i+5; j < s.length(); j++) {
                        if (s.charAt(j) == ')') {
                            break;
                        }
                        counter++;
                    }
                    
                }
                if (position != 0)
                    break;
            }
            if (position == 0)
                return s;
            exp = s.substring(position, position + counter);
            double y = Double.valueOf((String)exp);
            double res = Math.sinh(y);
            
            return s.substring(0, position - 5) + res + s.substring(position + counter +1);
            
        }
        public static String cosh(String s){
            String exp = "";
            int counter = 0;
            int position = 0;
            for ( int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'c' && s.charAt(i + 3) == 'h') {
                    position = i + 5;
                    for (int j = i+5; j < s.length(); j++) {
                        if (s.charAt(j) == ')') {
                            break;
                        }
                        counter++;
                    }
                    
                }
                if (position != 0)
                    break;
            }
            if (position == 0)
                return s;
            exp = s.substring(position, position + counter);
            double y = Double.valueOf((String)exp);
            double res = Math.cosh(y);
            
            return s.substring(0, position - 5) + res + s.substring(position + counter +1);
            
        }
        public static String tanh(String s){
            String exp = "";
            int counter = 0;
            int position = 0;
            for ( int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 't' && s.charAt(i + 3) == 'h') {
                    position = i + 5;
                    for (int j = i+5; j < s.length(); j++) {
                        if (s.charAt(j) == ')') {
                            break;
                        }
                        counter++;
                    }
                    
                }
                if (position != 0)
                    break;
            }
            if (position == 0)
                return s;
            exp = s.substring(position, position + counter);
            double y = Double.valueOf((String)exp);
            double res = Math.tanh(y);
            
            return s.substring(0, position - 5) + res + s.substring(position + counter +1);
            
        }
        public static String asin(String s){
            String exp = "";
            int counter = 0;
            int position = 0;
            for ( int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'a' && s.charAt(i + 1) == 's') {
                    position = i + 5;
                    for (int j = i+5; j < s.length(); j++) {
                        if (s.charAt(j) == ')') {
                            break;
                        }
                        counter++;
                    }
                    
                }
                if (position != 0)
                    break;
            }
            if (position == 0)
                return s;
            exp = s.substring(position, position + counter);
            double y = Double.valueOf((String)exp);
            double res = Math.asin(y);
            
            return s.substring(0, position - 5) + res + s.substring(position + counter +1);
            
        }
        
        public static String atan(String s){
            String exp = "";
            int counter = 0;
            int position = 0;
            for ( int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'a' && s.charAt(i + 3) == 'n') {
                    position = i + 5;
                    for (int j = i+5; j < s.length(); j++) {
                        if (s.charAt(j) == ')') {
                            break;
                        }
                        counter++;
                    }
                    
                }
                if (position != 0)
                    break;
            }
            if (position == 0)
                return s;
            exp = s.substring(position, position + counter);
            double y = Double.valueOf((String)exp);
            double res = Math.atan(y);
            
            return s.substring(0, position - 5) + res + s.substring(position + counter +1);
            
        }
        
        public static String acos(String s){
            String exp = "";
            int counter = 0;
            int position = 0;
            for ( int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'a' && s.charAt(i + 1) == 'c') {
                    position = i + 5;
                    for (int j = i+5; j < s.length(); j++) {
                        if (s.charAt(j) == ')') {
                            break;
                        }
                        counter++;
                    }
                    
                }
                if (position != 0)
                    break;
            }
            if (position == 0)
                return s;
            exp = s.substring(position, position + counter);
            double y = Double.valueOf((String)exp);
            double res = Math.acos(y);
            
            return s.substring(0, position - 5) + res + s.substring(position + counter +1);
            
        }

        
//        private class del implements ActionListener  {
//            String s = "";
//
//            public void actionPerformed(ActionEvent event) {
//                s = screen.getText().substring(0, screen.getText().length() - 1);
//                screen.setText(s);
//            }
//        }
        private class del implements ActionListener  {
            String s = "";

            public void actionPerformed(ActionEvent event) {
                int position = 0;
                if (screen.getText().charAt(screen.getText().length() - 1) == '(') {
                    
                    for (int i = screen.getText().length() - 2; i >= 0; i--) {
                        if (screen.getText().charAt(i) == '+' || screen.getText().charAt(i) == '-'|| screen.getText().charAt(i) == '*'|| screen.getText().charAt(i) == '/'|| screen.getText().charAt(i) == '(' || (screen.getText().charAt(i) >= '0' && screen.getText().charAt(i) <= '9')) {
                            position = i;
                            break;
                        }
                    }
                    if (position == 0) {
                        s = screen.getText().substring(0, position);
                        screen.setText(s);
                    }else {
                        s = screen.getText().substring(0, position +1);
                        screen.setText(s);
                    }
                    
                }else {
                    s = screen.getText().substring(0, screen.getText().length() - 1);
                    screen.setText(s);
                }
                
            }
        }
        
        private class clr implements ActionListener  {
            String s = "";

            public void actionPerformed(ActionEvent event) {
                screen.setText("");
            }
        }
        private class exit implements ActionListener  {
            public void actionPerformed(ActionEvent event) {
                // return 0 for sucessful operation
                System.exit(0);
            }
        }
        
        
        
        // the engine string modification
        // detecting the fact and calculating it
        // return a new string to the engine with the fact calculated
        public  String modFact(String s) {
        
            int counter = 0, position = 0;
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '!') {

                     position = i;
                    for (int j = i - 1; j >=0 ; j--) {
                        if (s.charAt(j) < 48 || s.charAt(i) > 57)
                            break;
                        counter++;
                    }
                    break;
                }
            }

            if (position == 0)
                return s;

            String num = "";
            for (int i = position - counter; i < position; i++) {
                num += s.charAt(i);
            }


            long fact = fact(Integer.parseInt(num));


            String factmod = s.substring(0, position - counter) + Long.toString(fact) + s.substring(position + 1);

            
             return factmod;
        
        
        }
    
        public static long fact(int x) {
            long product = 1;
            for (int i = 1; i <= x; i++) {
                product *= i;
            }
            return product;
        }
        
        public static String modTriangular(String s) {
            String sin = s.replace("sin", "Math.sin");
            String cos = sin.replace("cos(", "Math.cos(");
            String tan = cos.replace("tan", "Math.tan");
            String pi = tan.replace("PI", "Math.PI");
            String sqrt = pi.replace("sqrt", "Math.sqrt");
            String exp = sqrt.replace("e", "2.7");
            //System.out.println(exp);
            return exp;
        }
	
        public String powery(String s) {
            String c = "";
            int counter = 0;
            int position = 0;
           
            for(int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '^' && s.charAt(i + 1) == '('){
                    position = i;
                    for (int j = i - 1; j >=0 ; j--) {
                        if (s.charAt(j) < 48 || s.charAt(j) > 57)
                            break;
                        counter++;
                    }
                   
                }
                if (position != 0)
                    break;
                if (position == 0 && i == s.length() - 1)
                    return s;
                
            }
            
            int x = Character.getNumericValue(s.charAt(position + 2));
            if (position == 0)
                return s;
            
            c = s.substring(0, position - counter) + "Math.pow(" + s.substring(position - counter, position ) + ", " + x + ")" + s.substring(position + 4);
            String cc = "";
            for(int i = 0; i < c.length(); i++) {
                if (c.charAt(i) == '^' && c.charAt(i + 1) == '('){
                    cc = powery(c);
                }
            }
            
            if (cc != "")
                return cc;
            else 
                return c;
            
        }
        
        public static String perm(String s) {
            int position = 0, num1 = 0, num2 = 0;
            for(int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'p'){
                    position = i;
                    for (int j = i - 1; j >=0 ; j--) {
                        if (s.charAt(j) < 48 || s.charAt(j) > 57)
                            break;
                        num1++;
                    }
                    for (int j = i + 1; j < s.length() ; j++) {
                        if (s.charAt(j) < 48 || s.charAt(j) > 57)
                            break;
                        num2++;
                    }
                }
                if (position != 0)
                    break;
                if (position == 0 && i == s.length() - 1)
                    return s;

            }
            int n = Integer.parseInt(s.substring(position - num1, position));
            int r = Integer.parseInt(s.substring(position + 1, position + num2 + 1));
            long res = fact(n) / fact(n - r);
            return s.substring(0, position - num1) + Long.toString(res) +s.substring(position + num2 + 1);
        }
        public static String comp(String s) {
            int position = 0, num1 = 0, num2 = 0;
            for(int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'C'){
                    position = i;
                    for (int j = i - 1; j >=0 ; j--) {
                        if (s.charAt(j) < 48 || s.charAt(j) > 57)
                            break;
                        num1++;
                    }
                    for (int j = i + 1; j < s.length() ; j++) {
                        if (s.charAt(j) < 48 || s.charAt(j) > 57)
                            break;
                        num2++;
                    }
                }
                if (position != 0)
                    break;
                if (position == 0 && i == s.length() - 1)
                    return s;

            }
            int n = Integer.parseInt(s.substring(position - num1, position));
            int r = Integer.parseInt(s.substring(position + 1, position + num2 + 1));
            long res = fact(n) / (fact(n - r)*fact(r));
            return s.substring(0, position - num1) + Long.toString(res) +s.substring(position + num2 + 1);
        }
        public static String log10(String s) {
            int position = 0, counter = 0;
            for(int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'l' && s.charAt(i + 3) == '1') {
                    position = i;
                    for (int j = i + 6; j < s.length() ; j++) {
                        if (s.charAt(j) < 48 || s.charAt(j) > 57)
                            break;
                            counter++;
                        }
                }
            }
            if (position == 0 && counter == 0)
                return s;
            int x = Integer.parseInt(s.substring(position + 6,position + 6 + counter));
            return s.substring(0, position) +  Double.toString(Math.log10(x)) + s.substring(position + 7 + counter);
        }
        public static String log(String s) {
            int position = 0, counter = 0;
            for(int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'l' && s.charAt(i + 3) == '(') {
                    position = i;
                    for (int j = i + 4; j < s.length() ; j++) {
                        if (s.charAt(j) < 48 || s.charAt(j) > 57)
                            break;
                            counter++;
                        }
                }
            }
            if (position == 0 && counter == 0)
                return s;
            int x = Integer.parseInt(s.substring(position + 4,position + 4 + counter));
            return s.substring(0, position) +  Double.toString(Math.log(x)) + s.substring(position + 5 + counter);
        }
        public String astric(String s) {
            String res = "";
            for ( int i = 0; i < s.length(); i++) {
                if ((s.charAt(i) >= 48 && s.charAt(i) <= 57) && (i != s.length() - 1) &&(s.charAt(i + 1) == 's' || s.charAt(i + 1) == 'e' || s.charAt(i + 1) == 'P' || s.charAt(i + 1) == 'c' || s.charAt(i + 1) == 'a' || s.charAt(i + 1) == 't')) {
                    res = s.substring(0, i + 1) + '*' + s.substring(i +1);
                }
            }
            if (res == "")
                return s;
            return res;
        }
        public static String reciprocal(String s) {
        	
            int counter = 0, position = 0;
            for (int i = 0; i < s.length(); i++) {
                    if(s.charAt(i) == '^' && s.charAt(i + 1) == '(' && s.charAt(i + 2) == '-' && s.charAt(i + 3) == '1') {
                            position = i;
                            for (int j = i - 1; j >=0 ; j--) {
                                    if (s.charAt(j) < 48 || s.charAt(j) > 57)
                                            break;
                                    counter++;
                            }
                            break;
                    }
            }

            if (position == 0)
                    return s;

            String num = s.substring(position - counter , position);



            String recipres = s.substring(0, position - counter) + "Math.pow(" + s.substring(position - counter, position ) + ", -1)" + s.substring(position + counter + 3);

            String cc = "";
            for(int i = 0; i < recipres.length(); i++) {
                if (recipres.charAt(i) == '^' && recipres.charAt(i + 1) == '(' && recipres.charAt(i + 2) == '-' && recipres.charAt(i + 3) == '1'){
                    cc = reciprocal(recipres);
                }
            }

            if (cc != "")
                return cc;
            else 
                return recipres;
        	
        }
        public static String nthrt(String s) {
            int position = 0, num1 = 0, num2 = 0;
            for(int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == 'n' && s.charAt(i+1) == 't' && s.charAt(i+2) == 'h'){
                            position = i;
                            for (int j = i - 1; j >=0 ; j--) {
                                    if (s.charAt(j) < 48 || s.charAt(j) > 57)
                                            break;
                                    num1++;
                            }
                            for (int j = i + 6; j < s.length() ; j++) {
                                    if (s.charAt(j) < 48 || s.charAt(j) > 57)
                                            break;
                                    num2++;
                            }
                    }
                    if (position != 0)
                            break;
                    if (position == 0 && i == s.length() - 1)
                            return s;

            }
            int n = Integer.parseInt(s.substring(position - num1, position));
            int number = Integer.parseInt(s.substring(position + 6, position + num2 + 6));

            return s.substring(0, position - num1) + "Math.pow(" + number + ", " + (1.0/n) + ")" + s.substring(position + num2 + 7);
        }
        
        public String cbrt(String s) {
            int position = 0, num1 = 0;
            for(int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'c' && s.charAt(i+1) == 'b' && s.charAt(i+2) == 'r'){
                        position = i;

                        for (int j = i + 5; j < s.length() ; j++) {
                                if (s.charAt(j) < 48 || s.charAt(j) > 57)
                                        break;
                                num1++;
                        }

                }
            if (position != 0)
                    break;
            if (num1 == 0 && i == s.length() - 1)
                return s;

            }
            if (num1 == 0)
                return s;
            int n = Integer.parseInt(s.substring(position + 5, position + 5 + num1));

            return s.substring(0, position) + "Math.pow(" + n + ", " + (1.0/3) + ")" + s.substring(position + num1 + 6);
        }
        public String fina(String s) {
            
            String a0 = astric(s);
            String a1 = modFact(a0);
            String a2 = perm(a1);
            String a3 = comp(a2);
            String a4 = powery(a3);
            String a5 = sinh(a4);
            String a6 = cosh(a5);
            String a7 = tanh(a6);
            String a8 = asin(a7);
            String a9 = acos(a8);
            String a10 = atan(a9);
            String a11 = modTriangular(a10);
            String a12 = log10(a11);
            String a13 = log(a12);
            String a14 = reciprocal(a13);
            String a15 = nthrt(a14);
            String a16 = cbrt(a15);
            //System.out.println(a16);
            return a16;
            
        }
        
}
