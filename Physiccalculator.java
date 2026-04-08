import java.util.*;
public class Physiccalculator
{
    static Double v,u,a,b,t,s,f,G=0.0000000000667,m1,m2,r,h,g,q,n,e,I,L,rho,ans;
    public Double Law1()
    {
        v=u+a*t;
        return v;
    }

    public Double Law2()
    {
        s=(u*t)+(0.5*a*t*t);
        return s;
    }

    public Double Law3()
    {
        v=Math.sqrt(u*u+2*a*s);
        return v;
    }

    public Double Time()
    {
        t=(2*u*Math.sin(a))/9.8;
        return t;
    }

    public Double Heigth()
    {
        h=(u*u*Math.sin(a)*Math.sin(a))/19.6;
        return h;
    }

    public Double Range()
    {
        r=(u*u*Math.sin(2*a))/9.8;
        return r;
    }

    public Double Force()
    {
        f=(G*m1*m2)/(r*r);
        return f;
    }

    public Double Acg()
    {
        g=(G*m1)/(r*r);
        return g;
    }

    public Double Totalcharge()
    {
        q=n*e;
        return q;
    }

    public Double Current()
    {
        I=q/t;
        return I;
    }

    public Double Voltage()
    {
        v=I*r;
        return v;
    }

    public Double specificresistance()
    {
        rho=(r*a)/L;
        return rho;
    }

    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        Physiccalculator ob=new Physiccalculator();
        System.out.println("****************Physics Calculator****************");
        System.out.println("Select the topic of your question \n Enter 1-Laws of motion in a plane \n Enter 2-Angular projectile motion \n Enter 3-Gravitation \n Enter 4-Current Electricity");
        int c=in.nextInt();
        switch(c)
        {
            case 1:
                {
                    System.out.println("Select what you want to calculate \n Enter 1-Velocity from equation 1 of laws of motion \n Enter 2-Displacement from equation 2 of laws of motion \n Enter 3-Velocity from equation 3 of laws of motion");
                    int d=in.nextInt();
                    switch(d)
                    {
                        case 1:
                            {
                                System.out.println("Enter the value of initial velocity(in m/sec),acceleration(in m/sec^2) and time(in sec) respectively");
                                u=in.nextDouble();
                                a=in.nextDouble();
                                t=in.nextDouble();
                                ans=ob.Law1();
                                System.out.println("Velocity from laws of motion 1="+ans+"m/sec");
                                break;
                            }
                        case 2:
                            {
                                System.out.println("Enter the value of initial velocity(in m/sec), acceleration(in m/sec^2) and time(in sec) respectively");
                                u=in.nextDouble();
                                a=in.nextDouble();
                                t=in.nextDouble();
                                ans=ob.Law2();
                                System.out.println("Displacement from laws of motion 2="+ans+"m");
                                break;
                            }
                        case 3:
                            {
                                System.out.println("Enter the value of initial velocity(in m/sec),acceleration(in m/sec^2) and time(in sec) respectively");
                                u=in.nextDouble();
                                a=in.nextDouble();
                                t=in.nextDouble();
                                ans=ob.Law3();
                                System.out.println("Velocity from laws of motion 3="+ans+"m/sec");
                                break;
                            }
                    }
                    break;
                }
            case 2:
                {
                    System.out.println("Select what you want to calculate \n Enter 1-Time of projectile\n Enter 2-Height of projectile \n Enter 3-Range of projectile");
                    int d=in.nextInt();
                    switch(d)
                    {
                        case 1:
                            {
                                System.out.println("Enter the value of initial velocity(in m/sec) and angle respectively");
                                u=in.nextDouble();
                                b=in.nextDouble();
                                a=(b*22)/1260;
                                ans=ob.Time();
                                System.out.println("Time of projectile="+ans+"sec");
                                break;
                            }
                        case 2:
                            {
                                System.out.println("Enter the value of initial velocity(in m/sec) and angle respectively");
                                u=in.nextDouble();
                                b=in.nextDouble();
                                a=(b*22)/1260;
                                ans=ob.Heigth();
                                System.out.println("Maximum Height of projectile="+ans+"m");
                                break;
                            }
                        case 3:
                            {
                                System.out.println("Enter the value of initial velocity(in m/sec) and angle respectively");
                                u=in.nextDouble();
                                b=in.nextDouble();
                                a=(b*22)/1260;
                                ans=ob.Range();
                                System.out.println("Range of projectile="+ans+"m");
                                break;
                            }
                    }
                    break;
                }
            case 3:
                {
                    System.out.println("Select what you want to calculate \n Enter 1- Gravitation Force \n Enter 2-Acceleration due to Gravity ");
                    int d=in.nextInt();
                    switch(d)
                    {
                        case 1:
                            {
                                System.out.println("Enter the value of Mass1(in kg),Mass2(in kg) and Radius(in m) between them respectively");
                                m1=in.nextDouble();
                                m2=in.nextDouble();
                                r=in.nextDouble();
                                ans=ob.Force();
                                System.out.println("Gravitational Force="+ans+"Newton");
                                break;
                            }
                        case 2:
                            {
                                System.out.println("Enter the value of Mass of the planet(in kg) and the radius of the planet(in m) respectively");
                                m1=in.nextDouble();
                                r=in.nextDouble();
                                ans=ob.Acg();
                                System.out.println("Acceleration due to Gravity ="+ans+"m/sec^2");
                                break;
                            }
                    }
                    break;
                }
            case 4:
                {
                    System.out.println("Select what you want to calculate \n Enter 1-Total charge \n Enter 2- Current \n Enter 3-Voltage \n Enter 4-Specific resistance");
                    int d=in.nextInt();
                    switch(d)
                    {
                        case 1:
                            {
                                System.out.println("Enter the value of Number of electrons and charge of the electron(in Coulomb) respectively");
                                n=in.nextDouble();
                                e=in.nextDouble();
                                ans=ob.Totalcharge();
                                System.out.println("Total charge of the electrons are="+ans+"Coulomb");
                                break;
                            }
                        case 2:
                            {
                                System.out.println("Enter the value of charge(in Coulomb) and time(in sec) respectively");
                                q=in.nextDouble();
                                t=in.nextDouble();
                                ans=ob.Current();
                                System.out.println("Current="+ans+"Ampere");
                                break;
                            }
                        case 3:
                            {
                                System.out.println("Enter the value of current(in Ampere) and resistance(in ohm) respectively");
                                I=in.nextDouble();
                                r=in.nextDouble();
                                ans=ob.Voltage();
                                System.out.println("Voltage="+ans+"Volt");
                                break;
                            }
                        case 4:
                            {
                                System.out.println("Enter the value of resistance,area(in m^2) and length(in m) of the conductor respectively");
                                r=in.nextDouble();
                                a=in.nextDouble();
                                L=in.nextDouble();
                                ans=ob.specificresistance();
                                System.out.println("Specific resistance="+ans+"ohm*m");
                                break;
                            }
                    }
                    break;
                }
        }
    }
}