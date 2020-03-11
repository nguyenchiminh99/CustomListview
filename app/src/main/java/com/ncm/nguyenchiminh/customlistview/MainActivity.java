package com.ncm.nguyenchiminh.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ListView;

import com.ncm.nguyenchiminh.customlistview.adapter.CustomAdapter;
import com.ncm.nguyenchiminh.customlistview.model.Contact;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lvContact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvContact = findViewById(R.id.lv_item);
        Contact contact1 = new Contact("Nguyễn Chí Minh","0389043421", Color.BLUE);
        Contact contact2 = new Contact("Nguyễn Chí Mung","0389043434", Color.CYAN);
        Contact contact3 = new Contact("Nguyễn Chí Mang","0389042355", Color.GREEN);
        Contact contact4 = new Contact("Nguyễn Chí Lan","0389043765", Color.GRAY);
        Contact contact5 = new Contact("Nguyễn Chí Khanh","0389043876", Color.LTGRAY);
        Contact contact6 = new Contact("Nguyễn Chí Hoa","0389043986", Color.YELLOW);
        Contact contact7 = new Contact("Nguyễn Chí Đào","0389043643", Color.MAGENTA);
        Contact contact8 = new Contact("Nguyễn Chí Nở","0389043641", Color.BLACK);

        ArrayList<Contact> arrContacts = new ArrayList<>();
        arrContacts.add(contact1);
        arrContacts.add(contact2);
        arrContacts.add(contact3);
        arrContacts.add(contact4);
        arrContacts.add(contact5);
        arrContacts.add(contact6);
        arrContacts.add(contact7);
        arrContacts.add(contact8);
        CustomAdapter customAdapter = new CustomAdapter(this,R.layout.row_item,arrContacts);
        lvContact.setAdapter(customAdapter);
    }
}
