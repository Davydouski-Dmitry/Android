package com.davydouski.androidpvt.Homework6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.davydouski.androidpvt.R;

import java.util.ArrayList;

public class HW6student extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private EditText editET;
    private EditText deleteET;
    private Button editBtn;
    private Button deleteBtn;

    private ArrayList<Student> mStudentArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hw6student);
        //создаём методы для вставки и создания какого-либо нового студента
        editStudent();
        buildRecyclerView();
        //всё для кнопок для добавления и удаления нового студента
        editBtn = findViewById(R.id.button_edit);
        deleteBtn = findViewById(R.id.button_delete);
        editET = findViewById(R.id.editText_edit);
        deleteET = findViewById(R.id.editText_delete);

        editBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = Integer.parseInt(editET.getText().toString());
                editItem(position);
            }
        });

        deleteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = Integer.parseInt(deleteET.getText().toString());
                deleteItem(position);
            }
        });
    }

    public void editItem(int position){//метод для добавления нового студента в RecyclerView по позиции в списке
        mStudentArrayList.add(position, new Student(R.drawable.first, "New","Student"+position));
        mAdapter.notifyItemInserted(position);
    }

    public void deleteItem(int position){
        mStudentArrayList.remove(position);
        mAdapter.notifyItemRemoved(position);//хз
    }



    public void editStudent() {
        mStudentArrayList = new ArrayList<>();
        mStudentArrayList.add(new Student(R.drawable.first, "Dima","Davidouski"));
        mStudentArrayList.add(new Student(R.drawable.second, "Nic","Pupko"));
        mStudentArrayList.add(new Student(R.drawable.third, "Djon","Citan"));
        mStudentArrayList.add(new Student(R.drawable.first, "Vasa","Davidodsd"));
        mStudentArrayList.add(new Student(R.drawable.second, "Jora","Pupkodfds"));
        mStudentArrayList.add(new Student(R.drawable.third, "Misha","Citansdsd"));
        mStudentArrayList.add(new Student(R.drawable.first, "Vasa","Davidodsds"));
        mStudentArrayList.add(new Student(R.drawable.second, "Oleg","Pupkodfssdsd"));
    }

    public void buildRecyclerView() {
        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new StudentAdapter(mStudentArrayList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }
}
