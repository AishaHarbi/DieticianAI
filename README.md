# DieticianAI
This bot has been converted to java based on the work of https://github.com/Nitintin/Dietitian_AI with minor changes (due to using a different PL) and added new features (workout suggestions)
An AI dietician A bot  that takes input from the user and outputs suggestions for daily meals as well as exercise instructions depending on the user's calorie intake and activity level.
Input details from the user: Age (in years), Weight (in pounds), Height (in Feet and Inches) and daily exercise level.
-	Calculate Basal Metabolic Rate (BMR) using the Harris-Benedict Equations: Men BMR= 88.362 + (13.397 * weight in kg) + (4.799 * height in cm) – (5.677 * age in years) Women BMR = 447.593 + (9.247 * weight in kg) + (3.099 * height in cm) – (4.330 * age in years)
-	Calculate the calorie intake using the following table:
Exercise level Daily Calories Required (Kcal/day) Little to no exercise Daily kilocalories needed = BMR x 1.2 Light exercise (1–3 days per week) Daily kilocalories needed = BMR x 1.375 Moderate exercise (3–5 days per week) Daily kilocalories needed = BMR x 1.55 Heavy exercise (6–7 days per week) Daily kilocalories needed = BMR x 1.725 Very heavy exercise (twice per day, extra heavy workouts) Daily kilocalories needed = BMR x 1.9
- The excerciese suggestions have been based upon intutive measures. 
