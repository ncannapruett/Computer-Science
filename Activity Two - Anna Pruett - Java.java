// #4: I am utilizing strings and iteration by removing everything from the sentence to is a // determine the sentiment value of a review. The strings help with figuring out what
// space and what is a word.
// #5 (a): Yes, they make sense because of the sentiment values of the words included.
// #5 (b): Remove punctuation and spaces from the string to cause the method to run // // smoother.
// #6: He started with if(totalSentiment < 15) when he should of started with
// if(totalSentiment < 0) and then increased the number through the next else if and
// else statements.

public static double totalSentiment(String fileName) 
{
   String file = textToString(fileName) String word = ��;
   String space = � �;
   double totalVal = 0.0;
   
   for(int i = 0; i < file.length(); i++) 
   {
      String letter = file.substring(i, i + 1);
      if(letter.equals(space)) 
      {
         getPunctuation(word); 
         removePunctuation(word); 
         totalVal += sentimentVal(word); 
         word = ��;
      } 
      else 
      {
         word += letter; 
      }
   }
   return totalVal; 
}

public static int starRating(String fileName) 
{
   int totalSentiment = (int) totalSentiment(fileName);
   
   if(totalSentiment < 0) 
   {
      return 1; 
   }
   else if(totalSentiment < 5) 
   {
      return 2; 
   }
   else if(totalSentiment < 5) 
   {
      return 3;
   }
   else 
   {
      return 4; 
   }
}