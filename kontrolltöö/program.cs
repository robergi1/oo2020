using System;
using System.IO;

namespace CS_Examples
{


    class Program
    {



        static void Main(string[] args)
        {
            subclasses();
        }

        static void ex01()
        {
            //Kirjuta ekraanile kaks rida (kaks järjestikust Console.WriteLine käsklust, kumbki omal real)

            Console.WriteLine("See on esimene rida");
            Console.WriteLine("See on teine rida");
        }

        static void ex02()
        {
            //Küsi ristkülikukujulise toa seinte pikkused ning arvuta põranda pindala

            Console.Write("Sein a:");
            int a = Convert.ToInt32(Console.ReadLine());
            Console.Write("Sein b:");
            int b = Convert.ToInt32(Console.ReadLine());

            int area = a * b;
            Console.WriteLine("Pindala on " + area.ToString());

        }

        static void ex03()
        {
            //Küsi inimese pikkus ning teata, kas ta on lühike, keskmine või pikk (piirid pane ise paika)

            Console.Write("Sisesta oma pikkus(cm):");
            int height = Convert.ToInt32(Console.ReadLine());

            switch (height)
            {
                case int h when height <= 160:
                    Console.WriteLine("Pigem lühike");
                    break;
                case int h when height <= 180:
                    Console.WriteLine("Pigem Keskmine pikkus");
                    break;
                case int h when height > 180:
                    Console.WriteLine("Pigem oled pikemat sorti");
                    break;
            }

        }

        static void ex04()
        {
            //•	Ütle kasutajale "Osta elevant ära!". Senikaua korda küsimust, kuni kasutaja lõpuks ise kirjutab "elevant". 

            string input = "";

            while (input != "elevant")
            {
                Console.WriteLine("Osta elevant ära!");
                input = Console.ReadLine();
            }

            Console.WriteLine("lõpuks!");

        }


        static string PrintSymbol(string s, int length)
        {
            //Koosta alamprogramm etteantud arvu tärnide väljatrükiks. Katseta.
            return new string(Convert.ToChar(s), length);
        }

        static void ex05()
        {
            //Koosta alamprogramm etteantud arvu tärnide väljatrükiks. Katseta.
            Console.WriteLine(PrintSymbol("*", 5));
        }

        static int[] AddToEach(int[] nrs, int nr)
        {
            for (int i = 0; i < nrs.Length; i++)
            {
                nrs[i] += nr;
            }
            return nrs;
        }

        static void ex06()
        {
            //Loo alamprogramm, mis suurendab kõiki massiivi elemente ühe võrra. Katseta.
            int[] nrs = new int[5] { 99, 199, 299, 399, 499 };

            AddToEach(nrs, 1);

        }

        static int MyPow(int nr, int p)
        {
            if (p == 0)
            {
                return 1;
            }
            else
            {
                return nr * MyPow(nr, p - 1);
            }

        }

        static void ex07()
        {
            //Lisa käsklus täisarvude astendamiseks tsükli abil. Katseta
            //Tegin rekursiooniga
            Console.WriteLine(MyPow(2, 3));

        }

        static void ex08()
        {
            //Tekita programmi abil fail, milles oleksid arvud ja nende ruudud ühest kahekümneni

            using (StreamWriter sw = File.CreateText("MinuFail.txt"))
            {

                for (int i = 1; i <= 10; i++)
                {
                    sw.WriteLine(i + " - " + MyPow(i, 2));
                }

                sw.Close();
            }

        }

        static void ex09()
        {
            //Kontrolli, kas kasutaja pakutud vastus oli õige
            Random r = new Random();
            int generatedNr = r.Next(20);


            int input = generatedNr - 1;

            while (input != generatedNr)
            {
                Console.Write("Kirjuta nr:");
                input = Convert.ToInt32(Console.ReadLine());

                if (input < generatedNr)
                {
                    Console.WriteLine("Nr on suurem!");
                }
                else if (input > generatedNr)
                {
                    Console.WriteLine("Nr on väiksem!");
                }

            }

            Console.Write("Arvasid ära! Nr oli " + generatedNr);
        }




        static void ex10()
        {
            //Koosta struktuur riidelappide andmete hoidmiseks: pikkus, laius, toon

            Cloth cloth1 = new Cloth(10, 10, "Punane");
            Cloth cloth2 = new Cloth(5, 5, "Sinine");

            Cloth[] cloths = new Cloth[2] { cloth1, cloth2 };
            //Koosta riidelappidest massiiv.

            foreach (Cloth c in cloths)
            {
                Console.WriteLine(c);
            }
        }


        static void subclasses()
        {
            // Õpetaja - õpilase alamklassid mis pärinevad isiku klassist
            Teacher t1 = new Teacher("Juku", "Mees", 30, 180);
            t1.SetSchool("TLÜ");
            t1.SetEducation("Doktor");
            
            Console.WriteLine(t1);

            Student s1 = new Student("Andreas", "Mees", 20, 190);
            s1.SetTeacher(t1);
            s1.SetSchool("TLÜ");
            s1.SetCource("Informaatika");
            Console.WriteLine(s1);
        }
    }


    public class Cloth
    {
        private int height;
        private int width;
        private int area;
        private string color;
        public Cloth(int height, int width, string color)
        {
            //Konstruktoris omastatakse sisestatud andmed klassi muutujatele ning arvutatakse pindala
            this.height = height;
            this.width = width;
            this.color = color;
            this.area = height * width;
            //Lisa käsklus lapi pindala arvutamiseks
        }

        public int GetArea() //funktsioon pindala tagastamiseks
        {
            return this.area;
        }

        public override string ToString()
        {
            return this.color + " lapp(" + height + " x " + width + ") pindalaga " + area;
        }

    }


    public class Person{

        private string name;
        private string gender;
        private int age;
        private int height;

        public Person(string name, string gender, int age, int height)
        {
            this.name = name;
            this.gender = gender;
            this.age = age;
            this.height = height;
        }

        public string getName()
        {
            return name;
        }

        public int getAge()
        {
            return age;
        }

    }

    public class Teacher : Person{

        private string education;
        private string school;
        public Teacher(string name, string gender, int age, int height) : base(name, gender, age, height)
        {

        }

        public void SetEducation(string education)
        {
            this.education = education;
        }

        public void SetSchool(string school)
        {
            this.school = school;
        }

        public override string ToString()
        {
            return this.getName() + " on õpetaja " + school + ", hariduseks on " + education;
        }

    }


    public class Student : Person
    {

        private Teacher teacher;
        private string school;
        private string course;
        public Student(string name, string gender, int age, int height) : base(name, gender, age, height)
        {

        }

        public void SetTeacher(Teacher teacher)
        {
            this.teacher = teacher;
        }

        public void SetSchool(string school)
        {
            this.school = school;
        }
        public void SetCource(string course)
        {
            this.course = course;
        }

        public override string ToString()
        {
            return this.getName() + " on õpilane " + school + ", kursuseks on " + course + " ja õpetajaks " +teacher.getName();
        }

    }


}