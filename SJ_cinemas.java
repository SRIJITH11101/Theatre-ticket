import java.util.*;
public class SJ_cinemas
{
    String name,mname;
    double gtotal;
    long ph;
    int d,t,date,tseat,cls_A=0,cls_B=0,cls_C=0,cls_D=0,srs;
    char r[]=new char[27];
    int c[]=new int[10];
    String s1="",s2="",s3="",s4="",s5="",s6="",month;
    Scanner sc=new Scanner (System.in);
    public void bio()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter your name");
        name=sc.next();
        System.out.println("Enter your phone number");
        ph=sc.nextLong();
        System.out.println("Enter today's date");
        date=sc.nextInt();
        System.out.println("Enter this month");
        month=sc.next();
        sc.close();
    }
    public String movie_select()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Movie list");
        //System.out.println("1.Interstellar\n2.Tenet\n3.Master\n4.Surrarai pottru\n5.Valimai");
        System.out.println("1.Interstellar\nCast:\n\tMatthew McConaughey as Copper\n\tAnne Hathaway as Brand\n\tJessica Chastain as Murph\nDirector:Christopher Nolan");
        System.out.println("2.Tenet\nCast:\n\tRobert Pattinson as Neil\n\tElizabeth Debicki as Kat\n\tJohn David Washington as the Protogonist\nDirector:Christopher Nolan");
        System.out.println("3.Master\nCast:\n\tVijay as John Durairaj\n\tMalavika Mohanan\n\tVijay Sethupathi\nDirector:Lokesh Kanagaraj");
        System.out.println("4.Soorarai Pottru\nCast:\n\tSuriya as Nedummaran Ranjangam\n\tAparna Balamurali as Bommi\nDirector:Sudha K Prasad");
        System.out.println("5.Inception\nCast:\n\tLeonardo DiCaprio as Cobb\n\tJosph Gorden-Levitt as Arthur\n\tEllen Page as Ariadne\nDierctor:Christopher Nolan");
        System.out.println("Select your movie by entering the right index no.");
        int mo=sc.nextInt();
        sc.close();
        if(mo<=0&&mo>5)
        {
            System.out.println("invalid movie selection");
            movie_select();
        }
        if(mo==1)
        mname="Interstellar";
        if(mo==2)
        mname="Tenet";
        if(mo==3)
        mname="Master";
        if(mo==4)
        mname="Soorarai pottru";
        if(mo==5)
        mname="Inception";
        return mname;
    }
    public void d_t()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the show date and time on this month");
        d=sc.nextInt();
        t=sc.nextInt();
        if(d<date)
        {
            System.out.println("invalid date");
            d_t();
        }
        sc.close();
    }
    public void seat_select()
    {
        //int x,y;
        Scanner sc=new Scanner(System.in);
        System.out.println("Our theater has seating capacity 270");
        System.out.println("How many seats do you want");
        tseat=sc.nextInt();
        System.out.println("total of 27 alphabetical rows and 10 columns of seats");
        System.out.println("Enter the row and column of your seats one after one(ie.A 10,B 8)");
        for(int i=1;i<=tseat;i++)
        {
            r[i]=sc.next().charAt(0);
            c[i]=sc.nextInt();
            if(r[i]>='A'&&r[i]<='F')
            cls_A+=1;
            if(r[i]>='G'&&r[i]<='P')
            cls_B+=1;
            if(r[i]>='Q'&&r[i]<='U')
            cls_C+=1;
            if(r[i]>='V'&&r[i]<='Z')
            cls_D+=1;
        }
        sc.close();
    }
    public void snacks()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Seating process done...");
        System.out.println("Now you can order for some snacks for your showtime");
        System.out.println("Select any of the option you like");
        System.out.println("1.Popcons\n2.Sandwich & Burger\n3.Hot foods\n4.Cakes\n5.Beverages\n6.savouries\n7. Or you dont want snack ordering");
        int a,b,m=1;
        while(m==1)
        {
        int n=sc.nextInt();
        switch (n)
        {
        case 1:
        System.out.println("In popcon what type do you want to have");
        System.out.println("1.Small Popcon\trs.120");
        System.out.println("2.Regular Popcon\trs.160");
        System.out.println("3.Large Popcon\trs.180");
        System.out.println("4.Caramel Popcon\trs.100");
        System.out.println("Enter your option");
        a=sc.nextInt();
        if(a==1)
        {
            System.out.println("No. of Popcons");
            b=sc.nextInt();
            srs=120*b;
            s1="Small popcon\trs.120\tQuantity= "+b;
        }
        if(a==2)
        {
            System.out.println("No. of Popcons");
             b=sc.nextInt();
             srs=160*b;
             s1="Regular popcon\trs.160\tQuantity= "+b;
        }
        if(a==3)
        {
            System.out.println("No. of Popcons");
             b=sc.nextInt();
             srs=180*b;
             s1="Large popcon\trs.180\tQuantity= "+b;
        }
        if(a==4)
        {
            System.out.println("No. of Popcons");
             b=sc.nextInt();
             srs=100*b;
             s1="Caramel popcon\trs.100\tQuantity= "+b;
        }
        break;
        case 2:
        System.out.println("In Sandwich & Burger what type do you want to have");
        System.out.println("1.1000 island sandwich\trs.160");
        System.out.println("2.Pesto mozzarella sandwich\trs.160");
        System.out.println("3.Griled Chicken sandwich\trs.170");
        System.out.println("4.Tandoori chicken sandwich\trs.170");
        System.out.println("5.Garden burger\trs.140");
        System.out.println("6.chicken burger\trs.160");
        System.out.println("Enter your option");
        a=sc.nextInt();
        if(a==1)
        {
            System.out.println("No. of Sandwiches");
            b=sc.nextInt();
            srs=160*b;
            s2="1000 island sandwich\trs.160\tQuantity= "+b;
        }
        if(a==2)
        {
            System.out.println("No. of Sandwiches");
            b=sc.nextInt();
            srs=160*b;
            s2="Pesto mozzarella sandwich\trs.160\tQuantity= "+b;
        }
        if(a==3)
        {
            System.out.println("No. of Sandwiches");
            b=sc.nextInt();
            srs=170*b;
            s2="grilled chicken sandwich\trs.170\tQuantity= "+b;
        }
        if(a==4)
        {
            System.out.println("No. of Sandwiches");
            b=sc.nextInt();
            srs=170*b;
            s2="tandoori chicken sandwich\trs.170\tQuantity= "+b;
        }
        if(a==5)
        {
            System.out.println("No. of Burgers");
            b=sc.nextInt();
            srs=140*b;
            s2="garden burger\trs.140\tQuantity= "+b;
        }
        if(a==7)
        {
            System.out.println("No. of Burgers");
            b=sc.nextInt();
            srs=160*b;
            s2="chicken burger\trs.160\tQuantity= "+b;
        }
        break;
        case 3:
        System.out.println("In Hot foods what type do you want to have");
        System.out.println("1.French Fries\trs.120");
        System.out.println("2.Masala fries\trs.140");
        System.out.println("3.Hot Dog\trs.110");
        System.out.println("4.Chicken nuggets\trs.150");
        System.out.println("5.veg samosa\trs.100");
        System.out.println("Enter your option");
        a=sc.nextInt();
        if(a==1)
        {
            System.out.println("No. of French fries");
            b=sc.nextInt();
            srs=120*b;
            s3="French fries\trs.120\tQuantity= "+b;
        }
        if(a==2)
        {
            System.out.println("No. of masala fries");
            b=sc.nextInt();
            srs=140*b;
            s3="masala fries\trs.140\tQuantity= "+b;
        }
        if(a==3)
        {
            System.out.println("No. of hot dogs");
            b=sc.nextInt();
            srs=110*b;
            s3="Hot dogs\trs.110\tQuantity= "+b;
        }
        if(a==4)
        {
            System.out.println("No. of chicken nuggets");
            b=sc.nextInt();
            srs=150*b;
            s3="Chicken nuggetes\trs.150\tQuantity= "+b;
        }
        if(a==5)
        {
            System.out.println("No. of samosas");
            b=sc.nextInt();
            srs=100*b;
            s3="veg samosas\trs.100\tQuantity= "+b;
        }
        break;
        case 4:
        System.out.println("In Cakes what type do you want to have");
        System.out.println("1.Butter cake\trs.75");
        System.out.println("2.fruit cake\trs.200");
        System.out.println("3.Ribbon cake\trs.325");
        System.out.println("4.Chocolate cake\trs.350");
        System.out.println("Enter your option");
        a=sc.nextInt();
        if(a==1)
        {
            System.out.println("No. of cakes");
            b=sc.nextInt();
            srs=75*b;
            s4="Butter cake\trs.75\tQuantity= "+b;
        }
        if(a==2)
        {
            System.out.println("No. of cakes");
            b=sc.nextInt();
            srs=200*b;
            s4="Fruit cake\trs.200\tQuantity= "+b;
        }
        if(a==3)
        {
            System.out.println("No. of cakes");
            b=sc.nextInt();
            srs=325*b;
            s4="Ribbon cake\trs.325\tQuantity= "+b;
        }
        if(a==4)
        {
            System.out.println("No. of cakes");
            b=sc.nextInt();
            srs=350*b;
            s4="Chocolate cake\trs.350\tQuantity= "+b;
        }
        break;
        case 5:
        System.out.println("In beverages what type do you want to have");
        System.out.println("1.Smart water\trs.50");
        System.out.println("2.cold coffee\trs.110");
        System.out.println("3.green tea\trs.180");
        System.out.println("4.Hot chocolate\trs.100");
        System.out.println("Enter your option");
        a=sc.nextInt();
        if(a==1)
        {
            System.out.println("No. of bottles");
            b=sc.nextInt();
            srs=50*b;
            s5="Smart water\trs.50\tQuantity= "+b;
        }
        if(a==2)
        {
            System.out.println("No. of coffee");
            b=sc.nextInt();
            srs=110*b;
            s5="cold coffee\trs.110\tQuantity= "+b;
        }
        if(a==3)
        {
            System.out.println("No. of tea");
            b=sc.nextInt();
            srs=180*b;
            s5="Green tea\trs.180.\tQuantity= "+b;
        }
        if(a==4)
        {
            System.out.println("No. of drinks");
            b=sc.nextInt();
            srs=100*b;
            s5="Hot chocolate\trs.100\tQuantity= "+b;
        }
        break;
        case 6:
        System.out.println("In savouries what type do you want to have");
        System.out.println("1.Veg puff\trs.70");
        System.out.println("2.Wheat puff\trs.70");
        System.out.println("3.Egg puff\trs.80");
        System.out.println("4.chicken puff\trs.80");
        System.out.println("Enter your option");
        a=sc.nextInt();
        if(a==1)
        {
            System.out.println("No. of puffs");
            b=sc.nextInt();
            srs=70*b;
            s6="Veg puff\trs.70\tQuantity= "+b;
        }
        if(a==2)
        {
            System.out.println("No. of puffs");
            b=sc.nextInt();
            srs=70*b;
            s6="Wheat puff\trs.70\tQuantity= "+b;
        }
        if(a==3)
        {
            System.out.println("No. of puffs");
            b=sc.nextInt();
            srs=80*b;
            s6="egg puff\trs.80\tQuantity= "+b;
        }
        if(a==4)
        {
            System.out.println("No. of puffs");
            b=sc.nextInt();
            srs=80*b;
            s6="chicken puff\trs.80\tQuantity= "+b;
        }
        break;
        case 7:
        srs=0;
        break;
        default:
        {
            System.out.println("Wrong choice");
        }
      }
      System.out.println("Do you want to continue ordering snacks\nIf so press 1 and see the previous list of snacks\nif not please enter 0");
      m=sc.nextInt();
    }
    sc.close();

  }
    public double calculate()
    {
        double rs,ttl1=0,ttl2=0,ttl3=0,ttl4=0,gst=28.0;
        if(cls_A>0)
        {
            rs=250*cls_A;
            ttl1=rs+(rs*(gst/100.0));
        }
        else if(cls_B>0)
        {
            rs=200*cls_B;
            ttl2=rs+(rs*(gst/100.0));
        }
        else if(cls_C>0)
        {
            rs=150*cls_C;
            ttl3=rs+(rs*(gst/100.0));
        }    
        else
        {
            rs=100*cls_D;
            ttl4=rs+(rs*(gst/100.0));
        }
        gtotal=ttl1+ttl2+ttl3+ttl4;
        return gtotal;
    }
    public void ticket(String movie_name,double gttl)
    {
        System.out.println("\tSJ CINEMAS");
        System.out.println("\tMovie Ticket");
        System.out.println("Your name: "+name);
        System.out.println("your phone number:"+ph);
        System.out.println("TICKET SECTION");
        System.out.println("Movie name: "+movie_name);
        System.out.println("Show date: "+d+" "+month+"    Timing: "+t+":00");
        System.out.println("No. of tickets: "+tseat);
        System.out.println("Seat no.");
        for(int i=1;i<=tseat;i++)
        {
            System.out.println(r[i]+" "+c[i]);
        }
        System.out.println("Total amount = "+gttl);
        if(s1!=""||s2!=""||s3!=""||s4!=""||s5!=""||s6!="")
        {
           System.out.println("SNACKS SECTION");
           System.out.println("Snacks ordered");
           if (s1!=""){System.out.println(s1);}
           if(s2!=""){System.out.println(s2);}
           if (s3!=""){System.out.println(s3);}
           if (s4!=""){System.out.println(s4);}
           if (s5!=""){System.out.println(s5);}
           if (s6!=""){System.out.println(s6);}
           System.out.println("snacks amount="+srs);
        }
        System.out.println("GRAND TOTAL");
        double total=gttl+srs;
        System.out.println("Rs."+total);
        System.out.println("Happy for booking tickets at SJ cinemas.\nHAVE A NICE DAY");
        sc.close();
    }
    public static void main(String[]args)
    {
        System.out.println("\t Welcome to SJ cinemas");
        String nm="";
        SJ_cinemas sj=new SJ_cinemas();
        sj.bio();
        nm=sj.movie_select();
        sj.d_t();
        sj.seat_select();
        sj.snacks();
        double gt=sj.calculate();
        sj.ticket(nm,gt);
    }
}