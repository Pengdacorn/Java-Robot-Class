import java.awt.event.*;
import java.awt.Robot;

public class Mail {
 public static void main(String args[]) {
  Robot bot = null;
  try {
   bot = new Robot();
  } catch (Exception failed) {
   System.err.println("Failed instantiating Robot: " + failed);
  }
   int mask = InputEvent.BUTTON1_DOWN_MASK;
   bot.mouseMove(1350, 0);
   bot.mousePress(mask);
   bot.mouseRelease(mask);
   bot.mouseMove(700, 475);
   bot.delay(10);
   bot.mousePress(mask);
   bot.mouseRelease(mask);
   for(int h = 0; h < 13; h++){
      for(int i = 0; i < 8; i++)
      {
         rand(bot);
      }
      bot.keyPress(KeyEvent.VK_ENTER);
      bot.keyRelease(KeyEvent.VK_ENTER);
      bot.delay(10);
   }
   
}
   
   public static void rand(Robot x){
   Robot bot = x;
   int shift = (int)(2*Math.random());
   if(shift % 2 == 0)
      bot.keyPress(KeyEvent.VK_SHIFT);
   int key = (int)(46*Math.random());
   if(key == 0){
      bot.keyPress(KeyEvent.VK_A);
      bot.keyRelease(KeyEvent.VK_A);
   }
   else if(key == 1){
      bot.keyPress(KeyEvent.VK_B);
      bot.keyRelease(KeyEvent.VK_B);
   }
   else if(key == 2){
      bot.keyPress(KeyEvent.VK_C);
      bot.keyRelease(KeyEvent.VK_C);
   }
   else if(key == 3){
      bot.keyPress(KeyEvent.VK_D);
      bot.keyRelease(KeyEvent.VK_D);
   }
   else if(key == 4){
      bot.keyPress(KeyEvent.VK_E);
      bot.keyRelease(KeyEvent.VK_E);
   }
   else if(key == 5){
      bot.keyPress(KeyEvent.VK_F);
      bot.keyRelease(KeyEvent.VK_F);
   }
   else if(key == 6){
      bot.keyPress(KeyEvent.VK_G);
      bot.keyRelease(KeyEvent.VK_G);
   }
   else if(key == 7){
      bot.keyPress(KeyEvent.VK_H);
      bot.keyRelease(KeyEvent.VK_H);
   }
   else if(key == 8){
      bot.keyPress(KeyEvent.VK_I);
      bot.keyRelease(KeyEvent.VK_I);
   }
   else if(key == 9){
      bot.keyPress(KeyEvent.VK_J);
      bot.keyRelease(KeyEvent.VK_J);
   }
   else if(key == 10){
      bot.keyPress(KeyEvent.VK_K);
      bot.keyRelease(KeyEvent.VK_K);
   }
   else if(key == 11){
      bot.keyPress(KeyEvent.VK_L);
      bot.keyRelease(KeyEvent.VK_L);
   }
   else if(key == 12){
      bot.keyPress(KeyEvent.VK_M);
      bot.keyRelease(KeyEvent.VK_M);
   }
   else if(key == 13){
      bot.keyPress(KeyEvent.VK_N);
      bot.keyRelease(KeyEvent.VK_N);
   }
   else if(key == 14){
      bot.keyPress(KeyEvent.VK_O);
      bot.keyRelease(KeyEvent.VK_O);
   }
   else if(key == 15){
      bot.keyPress(KeyEvent.VK_P);
      bot.keyRelease(KeyEvent.VK_P);
   }
   else if(key == 16){
      bot.keyPress(KeyEvent.VK_Q);
      bot.keyRelease(KeyEvent.VK_Q);
   }
   else if(key == 17){
      bot.keyPress(KeyEvent.VK_R);
      bot.keyRelease(KeyEvent.VK_R);
   }
   else if(key == 18){
      bot.keyPress(KeyEvent.VK_S);
      bot.keyRelease(KeyEvent.VK_S);
   }
   else if(key == 19){
      bot.keyPress(KeyEvent.VK_T);
      bot.keyRelease(KeyEvent.VK_T);
   }
   else if(key == 20){
      bot.keyPress(KeyEvent.VK_U);
      bot.keyRelease(KeyEvent.VK_U);
   }
   else if(key == 21){
      bot.keyPress(KeyEvent.VK_V);
      bot.keyRelease(KeyEvent.VK_V);
   }
   else if(key == 22){
      bot.keyPress(KeyEvent.VK_W);
      bot.keyRelease(KeyEvent.VK_W);
   }
   else if(key == 23){
      bot.keyPress(KeyEvent.VK_X);
      bot.keyRelease(KeyEvent.VK_X);
   }
   else if(key == 24){
      bot.keyPress(KeyEvent.VK_Y);
      bot.keyRelease(KeyEvent.VK_Y);
   }
   else if(key == 25){
      bot.keyPress(KeyEvent.VK_Z);
      bot.keyRelease(KeyEvent.VK_Z);
   }
   else if(key == 26){
      bot.keyPress(KeyEvent.VK_1);
      bot.keyRelease(KeyEvent.VK_1);
   }
   else if(key == 27){
      bot.keyPress(KeyEvent.VK_2);
      bot.keyRelease(KeyEvent.VK_2);
   }
   else if(key == 28){
      bot.keyPress(KeyEvent.VK_3);
      bot.keyRelease(KeyEvent.VK_3);
   }
   else if(key == 29){
      bot.keyPress(KeyEvent.VK_4);
      bot.keyRelease(KeyEvent.VK_4);
   }
   else if(key == 30){
      bot.keyPress(KeyEvent.VK_5);
      bot.keyRelease(KeyEvent.VK_5);
   }
   else if(key == 31){
      bot.keyPress(KeyEvent.VK_6);
      bot.keyRelease(KeyEvent.VK_6);
   }
   else if(key == 32){
      bot.keyPress(KeyEvent.VK_7);
      bot.keyRelease(KeyEvent.VK_7);
   }
   else if(key == 33){
      bot.keyPress(KeyEvent.VK_8);
      bot.keyRelease(KeyEvent.VK_8);
   }
   else if(key == 34){
      bot.keyPress(KeyEvent.VK_9);
      bot.keyRelease(KeyEvent.VK_9);
   }
   else if(key == 35){
      bot.keyPress(KeyEvent.VK_0);
      bot.keyRelease(KeyEvent.VK_0);
   }
   else if(key == 36){
      bot.keyPress(KeyEvent.VK_COMMA);
      bot.keyRelease(KeyEvent.VK_COMMA);
   }
   else if(key == 37){
      bot.keyPress(KeyEvent.VK_PERIOD);
      bot.keyRelease(KeyEvent.VK_PERIOD);
   }
   else if(key == 38){
      bot.keyPress(KeyEvent.VK_SLASH);
      bot.keyRelease(KeyEvent.VK_SLASH);
   }
   else if(key == 39){
      bot.keyPress(KeyEvent.VK_SEMICOLON);
      bot.keyRelease(KeyEvent.VK_SEMICOLON);
   }
   else if(key == 40){
      bot.keyPress(KeyEvent.VK_BACK_SLASH);
      bot.keyRelease(KeyEvent.VK_BACK_SLASH);
   }
   else if(key == 41){
      bot.keyPress(KeyEvent.VK_OPEN_BRACKET);
      bot.keyRelease(KeyEvent.VK_OPEN_BRACKET);
   }
   else if(key == 42){
      bot.keyPress(KeyEvent.VK_CLOSE_BRACKET);
      bot.keyRelease(KeyEvent.VK_CLOSE_BRACKET);
   }
   else if(key == 43){
      bot.keyPress(KeyEvent.VK_MINUS);
      bot.keyRelease(KeyEvent.VK_MINUS);
   }
   else if(key == 44){
      bot.keyPress(KeyEvent.VK_QUOTE);
      bot.keyRelease(KeyEvent.VK_QUOTE);
   }
   else if(key == 45){
      bot.keyPress(KeyEvent.VK_EQUALS);
      bot.keyRelease(KeyEvent.VK_EQUALS);
   }
   if(shift % 2 == 0)
      bot.keyRelease(KeyEvent.VK_SHIFT);
 }
 public static void mail(Robot x){
   Robot bot = x;
   bot.keyPress(KeyEvent.VK_M);
   bot.keyRelease(KeyEventVK_M);
   bot.keyPress(KeyEvent.VK_A);
   bot.keyRelease(KeyEventVK_A);
   bot.keyPress(KeyEvent.VK_I);
   bot.keyRelease(KeyEventVK_I);
   bot.keyPress(KeyEvent.VK_L);
   bot.keyRelease(KeyEventVK_L);
   bot.keyPress(KeyEvent.VK_PERIOD);
   bot.keyRelease(KeyEventVK_PERIOD);
   bot.keyPress(KeyEvent.VK_G);
   bot.keyRelease(KeyEventVK_G);
   bot.keyPress(KeyEvent.VK_O);
   bot.keyRelease(KeyEventVK_O);
   bot.keyPress(KeyEvent.VK_O);
   bot.keyRelease(KeyEventVK_O);
   bot.keyPress(KeyEvent.VK_G);
   bot.keyRelease(KeyEventVK_G);
   bot.keyPress(KeyEvent.VK_L);
   bot.keyRelease(KeyEventVK_L);
   bot.keyPress(KeyEvent.VK_E);
   bot.keyRelease(KeyEventVK_E);
   bot.keyPress(KeyEvent.VK_PERIOD);
   bot.keyRelease(KeyEventVK_PERIOD);
   bot.keyPress(KeyEvent.VK_C);
   bot.keyRelease(KeyEventVK_C);
   bot.keyPress(KeyEvent.VK_O);
   bot.keyRelease(KeyEventVK_O);
   bot.keyPress(KeyEvent.VK_M);
   bot.keyRelease(KeyEventVK_M);
   bot.keyPress(KeyEvent.VK_ENTER);
   bot.keyRelease(KeyEventVK_ENTER);
 }
  public static void mail(Robot x){
     Robot bot = x;mail
  }
}
  