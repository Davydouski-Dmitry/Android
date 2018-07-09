package com.davydouski.androidpvt.Homework6;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.davydouski.androidpvt.R;

import java.util.ArrayList;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudentViewHolder> {

    private ArrayList<Student> mStudentArrayList;

    public static class StudentViewHolder extends RecyclerView.ViewHolder{
        public ImageView mImageStudent;
        public TextView mtextViewStudentName;
        public TextView mtextViewStudentSurName;

        public StudentViewHolder(View itemView) {
            super(itemView);
            mImageStudent = itemView.findViewById(R.id.imageStudent);
            mtextViewStudentName = itemView.findViewById(R.id.textViewStudentName);
            mtextViewStudentSurName = itemView.findViewById(R.id.textViewStudentSurName);
        }
    }

    public StudentAdapter(ArrayList<Student> studentArrayList){
        mStudentArrayList = studentArrayList;
    }

    @Override
    public StudentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.student_item, parent,false );
        StudentViewHolder studentViewHolder = new StudentViewHolder(v);
        return studentViewHolder;
    }

    @Override
    public void onBindViewHolder(StudentViewHolder holder, int position) {
        Student currentItem = mStudentArrayList.get(position);

        holder.mImageStudent.setImageResource(currentItem.getImageStudent());
        holder.mtextViewStudentName.setText(currentItem.getName());
        holder.mtextViewStudentSurName.setText(currentItem.getSurname());
    }

    @Override
    public int getItemCount() {
        return mStudentArrayList.size();
    }





}
