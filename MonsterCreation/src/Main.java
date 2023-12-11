import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static List<Parent> l= new ArrayList<>();
    static List<Child> child=new ArrayList<>();
    public static void main(String[] args) throws IllegalAccessException {
        Scanner sc= new Scanner(System.in);

        while(true){
            System.out.println("Do you want to create monster(yes or no)");
            String o=sc.next();
            if(o.equals("no")){
                break;
            }
            System.out.println("Enter eyecolor");
            String ec=sc.next();
            System.out.println("Enter fethercolor");
            String fc=sc.next();
            System.out.println("Enter magicalability");
            String ma=sc.next();
            System.out.println("Enter weakness");
            String w=sc.next();
            System.out.println("Enter size");
            int size=sc.nextInt();
            System.out.println("Enter strength");
            int strength=sc.nextInt();
            System.out.println("Enter durability");
            int dura=sc.nextInt();
            System.out.println("Enter aggression");
            int agg=sc.nextInt();
            Parent p=new Parent(ec,fc,ma,w,size,strength,dura,agg);
            l.add(p);
        }
        for(int i=0;i<l.size()-1;i++){
            for(int j=i+1;j<l.size();j++){
                Parent p1=l.get(i);
                Parent p2=l.get(j);
                Child c= new Child();
                createChildMonster(p1,p2,c);
            }
        }
        System.out.println("Printing Parents Info");
        System.out.println("---------------");
        for(Parent p: l){
            System.out.println("EyesColor -" +p.getEyescolor());
            System.out.println("Fethercolor -"+p.getFethercolor());
            System.out.println("Magical Ability -"+p.getAbility());
            System.out.println("Weakness -"+p.getWeakness());
            System.out.println("Size -"+p.getSize());
            System.out.println("Strength -"+p.getStrength());
            System.out.println("Durability -"+p.getDurability());
            System.out.println("Aggression -"+p.getAggression());
            System.out.println("---------------");
        }
        System.out.println("Printing Childs Info");
        System.out.println("Noof childs created = "+child.size());
        System.out.println("---------------");
        for(Child p: child){
            System.out.println("EyesColor -" +p.getEyescolor());
            System.out.println("Fethercolor -"+p.getFethercolor());
            System.out.println("Magical Ability -"+p.getAbility());
            System.out.println("Weakness -"+p.getWeakness());
            System.out.println("Size -"+p.getSize());
            System.out.println("Strength -"+p.getStrength());
            System.out.println("Durability -"+p.getDurability());
            System.out.println("Aggression -"+p.getAggression());
            System.out.println("---------------");
        }

    }
    static void createChildMonster(Parent p1,Parent p2, Child c) throws IllegalAccessException {
        Field[] f1=p1.getClass().getDeclaredFields();
        Field[] f2=p2.getClass().getDeclaredFields();
        Field[] f3=c.getClass().getDeclaredFields();
        List<String> d= new ArrayList<>();
        List<Integer> j=new ArrayList<>();

        for(Field f:f1){
            f.setAccessible(true);
        }
        for(Field f:f2){
            f.setAccessible(true);
        }
        for(Field f:f3){
            f.setAccessible(true);
        }
        int i=0;
        int o=0;
        for(Field f: f1){
            if(i<4){
                String s1=String.valueOf(f.get(p1));
                String s2=String.valueOf(f.get(p2));
                String s=getRandomString(s1,s2);
                i=i+1;
                d.add(s);
            }
            else{
                int i1=(Integer) f.get(p1);
                int i2=(Integer) f.get(p2);
                int i3=getRandomString(i1,i2);
                j.add(i3);
            }
        }
        int s=4;
        for(Field f: f3){
            if(o<4 && s>0){
                f.set(c,d.get(o));
                o=o+1;
                s=s-1;
            }
            else{
                f.set(c,j.get(s));
                s=s+1;
            }
        }
        child.add(c);

    }

    static String getRandomString(String s1, String  s2){
        Random r= new Random();
        boolean u=r.nextBoolean();
        return u?s1:s2;
    }
    static int getRandomString(int s1, int  s2){
        Random r= new Random();
        boolean u=r.nextBoolean();
        return u?s1:s2;
    }

}