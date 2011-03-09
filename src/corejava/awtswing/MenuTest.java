package corejava.awtswing;
import   java.awt.*;   
import   java.awt.event.*;   
import   javax.swing.*;   
import   javax.swing.event.*;   
    
public   class   MenuTest   
{   
        public   static   void   main(String[]   args)   
        {       
              MenuFrame   frame   =   new   MenuFrame();   
              frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
              frame.show();   
        }   
}   
    
/**   
        A   frame   with   a   sample   menu   bar.   
*/   
class   MenuFrame   extends   JFrame   
{       
        public   MenuFrame()   
        {       
              setTitle("MenuTest");   
              setSize(DEFAULT_WIDTH,   DEFAULT_HEIGHT);   
    
              popup   =   new   JPopupMenu();   
              JMenuItem   item   =   new   JMenuItem("Click   me",new ImageIcon("C:\\Documents and Settings\\xk\\Desktop\\IMANÍ¼±ê\\main.png"));   
              JMenuItem   item2=new JMenuItem("Kelsen Xu");
              item.addActionListener(new   
                      ActionListener()   
                      {   
                              public   void   actionPerformed(ActionEvent   e)   
                              {   
                                      System.out.println("Hello,   world!");   
                              }   
                      });   
              JSeparator speparator=new JSeparator();
              popup.add(item);
              popup.add(speparator);
              popup.add(item2);
              popup.add(new JMenuItem("kkkkk"));
              
              
                                  
    
              getContentPane().addMouseListener(new     
                    MouseAdapter()   
                    {       
                          public   void   mousePressed(MouseEvent   event)   
                          {       
                                if   (event.isPopupTrigger())   
                                      popup.show(event.getComponent(),   
                                            event.getX(),   event.getY());   
                          }   
    
                          public   void   mouseReleased(MouseEvent   event)   
                          {       
                                if   (event.isPopupTrigger())   
                                      popup.show(event.getComponent(),   
                                            event.getX(),   event.getY());   
                          }   
                    });   
        }   
    
        public   static   final   int   DEFAULT_WIDTH   =   300;   
        public   static   final   int   DEFAULT_HEIGHT   =   200;       
    
        private   JPopupMenu   popup;   
}   
    
/**   
        A   sample   action   that   prints   the   action   name   to   System.out   
*/   
class   TestAction   extends   AbstractAction   
{       
        public   TestAction(String   name)   {   super(name);   }   
          
        public   void   actionPerformed(ActionEvent   event)   
        {   
              System.out.println(getValue(Action.NAME)   
                    +   "   selected.");   
        }   
}   

