package diet;
import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.List;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.*;
import javax.swing.text.JTextComponent;
import javax.swing.text.TextAction;

import javafx.geometry.Insets;

public  class Dietician  extends JApplet
implements ActionListener {
	 String[] protein = {"Yogurt(1 cup)", "Cooked meat(3 Oz)", "Cooked fish(4 Oz)",
			 "1 whole egg + 4 egg whites", "Tofu(5 Oz)"};
			    String[] fruit = {"Berries(80 Oz)", "Apple", "Orange", "Banana",
			    "Dried Fruits(Handfull)", "Fruit Juice(125ml)"};
			 String[]  vegetable = {"Any vegetable(80g)"};
			String[]  grains = {"Cooked Grain(150g)", "Whole Grain Bread(1 slice)", "Half Large Potato(75g)", "Oats(250g)",
		  "2 corn tortillas"};
	 String[] ps = {"Soy nuts(i Oz)", "Low fat milk(250ml)", "Hummus(4 Tbsp)", "Cottage cheese (125g)",
			 "Flavored yogurt(125g)"};
	  String[] taste_en = {"2 TSP (10 ml) olive oil", "2 TBSP (30g) reduced-calorie salad dressin", "1/4 medium avocado",
	 "Small handful of nuts', '1/2 ounce  grated Parmesan cheese",
		  "1 TBSP (20g) jam, jelly, honey, syrup, sugar"};
	  // String[] excercise1 = {"yoga" ....
	  // String excercise2 = {"run 1.5 km"

      private float calories;

      List list1, list2;
      private TextField weight;
      private TextField age;
      private TextField height;


      private double weightNo;
      private double ageNo;
      private double HeightNo;
      private String GenderTy;
      private String motion;
      JButton Button = new JButton("submit");
      private JLabel weightl = new JLabel("Weight (in pounds)");
      private JLabel genderl = new JLabel("Gender");
      private JLabel agel  = new JLabel("Age (in years)");
      private JLabel heightl  = new JLabel("Height (in cm)");
      private JLabel breakfast = new JLabel("");
      private JLabel lunch = new JLabel(" ");
      private JLabel snack  = new JLabel(" ");
      private JLabel snack1  = new JLabel(" ");
      private JLabel dinner  = new JLabel(" ");
      //private JLabel ex1 = new JLabel("");

   //  String[] gen = {"male","female"};

      public void init()
      {
    	  list1=new List(2,true); // male of female
    	  list2 = new List(5,true); //
    	     list1.add("male");
    	     list1.add("female");
    	     list2.add("Sedentary (little or no exercise)");
    	     list2.add("'Lightly active (1-3 days/week)");
    	     list2.add("Moderately active (3-5 days/week)");
    	     list2.add("Very active (6-7 days/week)");
    	     list2.add("Super active (twice/day)");

    	     add(list1);
    	     add(list2);
    	     list1.addActionListener(this);
    	     list2.addActionListener(this);
     list1.setBounds(200,70, 100, 35);
     list2.setBounds(190,200, 210, 100);
    	  weight = new TextField();
	  age = new TextField();
	  height = new TextField();
	  weight.setBounds(200, 110, 100, 20);
	  age.setBounds(200, 130, 100, 20);
	  height.setBounds(200, 150, 100, 20);
     weightl.setBounds(30, 20, 200, 200);
     genderl.setBounds(30, 2, 200, 200);
     agel.setBounds(30, 40, 200, 200);
     heightl.setBounds(30, 60, 200, 200);
     Button.setBounds(200, 300, 100, 60);
     breakfast.setBounds(530, 2, 600, 180);
     lunch.setBounds(530, 20, 600, 180);
     snack.setBounds(530, 40, 600, 180);
     dinner.setBounds(530, 60, 600, 180);
     snack1.setBounds(530, 80, 600, 180);
    	  add(weight);
    	  add(age);
    	  add(height);
         add(weightl);
         add(agel);
         add(heightl);
        add(genderl);
        add(Button);
        add(breakfast);
        add(lunch);
        add(snack);
        add(dinner);
        add(snack1);

         setLayout(null);

        Button.addActionListener( new ActionListener()
         {
             @Override
             public void actionPerformed(ActionEvent e)
             {
            	 weightNo = Integer.parseInt(weight.getText());
                HeightNo = Integer.parseInt(height.getText());
                 ageNo  = Integer.parseInt(age.getText());
                    GenderTy = list1.getSelectedItem();
                    motion = list2.getSelectedItem();
                	int randomNum = ThreadLocalRandom.current().nextInt(0, 4);

          		//	  weightNo = Integer.parseInt(weight.getText());
                  //      HeightNo = Integer.parseInt(height.getText());
                    //     ageNo  = Integer.parseInt(age.getText());
                      //      GenderTy = list1.getSelectedItem();
                        //    motion = list2.getSelectedItem();
                            if (GenderTy == "male") {
                             calories = (float) (88.362 + (13.397 * (float)weightNo + (4.799 * (float)HeightNo) -
                          		   (5.677 * (float)ageNo)));

                            }
                            else if( GenderTy == "female") {
                          	  calories = (float)(447.593 + (9.247 * (float)weightNo) +
                          			  (3.098 * (float)HeightNo) - (4.330 * (float)ageNo));

                          	  }

                            if (motion == "Sedentary (little or no exercise)") {
                          	  calories = (float) (calories * 1.2);}

                                else if (motion == "Lightly active (1-3 days/week)") {
                              	  calories = (float) (calories * 1.375);}

                              		  else if (motion == "Moderately active (3-5 days/week)") {
                              			  calories = (float) (calories * 1.55);}

                              		  else if (motion == "Very active (6-7 days/week)") {
                              			  calories = (float) (calories * 1.725);}

                              		  else if ( motion == "Super active (twice/day)") {
                              			  calories = (float) (calories * 1.9);}


                            if (calories < 1500) {
                          	  breakfast.setText( "Breakfast: "+protein[randomNum] + " + " + fruit[randomNum]);
                            lunch.setText("Lunch: " + protein[randomNum] + " + "
                            + vegetable[0] + " + Leafy Greens" + grains[randomNum] + " + "
                          		  + taste_en[randomNum]);
                            // ex1.setText(
                            }



          		  else if (calories < 1800) {
          			  breakfast.setText("Breakfast: " + protein[randomNum] + " + " + fruit[randomNum]);
          			  lunch.setText("Lunch: " + protein[randomNum] + " + " + vegetable[0] + " + Leafy Greens" + grains[
          randomNum] + " + " + taste_en[randomNum] + " + " + fruit[randomNum]);
          			  snack.setText("Snack: " + ps[randomNum] + " + " + vegetable[0]);;
          			  dinner.setText("Dinner: 2 " + protein[randomNum] + " + " + vegetable[0] + " + Leafy Greens" + grains[
          randomNum] + " + " + taste_en[randomNum]);
          			  snack1.setText("Snack: " + fruit[randomNum]);
          			  //
          		  }
          		  else if (calories < 2200) {
          			  breakfast.setText("Breakfast: " + protein[randomNum] + " + " + fruit[randomNum]);
          			  lunch.setText("Lunch: " + protein[randomNum] + " + " + vegetable[0] + " + Leafy Greens" + grains[
          randomNum] + " + " + taste_en[randomNum] + " + " + fruit[randomNum]);
          			  snack.setText("Snack: " + ps[randomNum] + " + " + vegetable[0]);;
          			  dinner.setText("Dinner: 2 " + protein[randomNum] + " + 2 " + vegetable[0] + " + Leafy Greens" + grains[randomNum
          		   ] + " + " + taste_en[randomNum]);
          			  snack1.setText("Snack: " + fruit[randomNum]);
          		  }
          		  else if (calories >= 2200) {
          			  breakfast.setText("Breakfast: 2 " + protein[randomNum] + " "
          			  		+ "+ " + fruit[randomNum] + " + " + grains[randomNum]);
          			  lunch.setText("Lunch: " + protein[randomNum] + " + " + vegetable[0] + " + Leafy Greens" + grains[
          randomNum] + " + " + taste_en[randomNum] + " + " + fruit[randomNum]);
          			  snack.setText("Snack: " + ps[randomNum] + " + " + vegetable[0]);;
          			  dinner.setText("Dinner: 2 " + protein[randomNum] + " + 2 " + vegetable[0] + " + Leafy Greens + 2 " + grains[
          randomNum] + " + 2 " + taste_en[randomNum]);

          		  }}}); } }
