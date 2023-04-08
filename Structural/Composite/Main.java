package exp2;

public class Main {
    public static void main(String[] args) {
        Contact cf1 = new Person("CF1", 1);
        Contact cf2 = new Person("CF2", 2);
        Contact cf3 = new Person("CF3", 3);

        Contact ff1 = new Person("FF1", 4);
        Contact ff2 = new Person("FF2", 5);
        Contact ff3 = new Person("FF3", 6);

        Contact m1 = new Person("M1", 7);
        Contact m2 = new Person("M2", 8);

        Contact f1 = new Person("f1", 9);
        Contact f2 = new Person("f1", 10);

        Contact dept1_1 = new Person("Dept1_1", 11);
        Contact dept1_2 = new Person("Dept1_2", 12);

        Contact dept2_1 = new Person("Dept2_1", 13);
        Contact dept2_2 = new Person("Dept2_2", 14);


        Group cfriends = new Group("Close Friends");
        Group ffriends = new Group("Family Friends");
        Group mside = new Group("Mother's Side");
        Group fside = new Group("Father's Side");
        Group dept1 = new Group("Department 1");
        Group dept2 = new Group("Department 2");

        Group friends = new Group("Friends");
        Group family = new Group("Family");
        Group colleagues = new Group("Colleagues");
        Group contacts = new Group("Contacts");

        cfriends.addContact(cf1);
        cfriends.addContact(cf2);
        cfriends.addContact(cf3);

        ffriends.addContact(ff1);
        ffriends.addContact(ff2);
        ffriends.addContact(ff3);

        mside.addContact(m1);
        mside.addContact(m2);

        fside.addContact(f1);
        fside.addContact(f2);

        dept1.addContact(dept1_1);
        dept1.addContact(dept1_2);

        dept2.addContact(dept2_1);
        dept2.addContact(dept2_2);

        friends.addContact(cfriends);
        friends.addContact(ffriends);
        family.addContact(mside);
        family.addContact(fside);
        colleagues.addContact(dept1);
        colleagues.addContact(dept2);

        
        contacts.addContact(family);
        contacts.addContact(friends);
        contacts.addContact(colleagues);

        contacts.display();
    }
}