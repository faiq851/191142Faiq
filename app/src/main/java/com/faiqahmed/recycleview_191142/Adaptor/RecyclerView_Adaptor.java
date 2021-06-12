package com.faiqahmed.recycleview_191142.Adaptor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.faiqahmed.recycleview_191142.R;
import com.faiqahmed.recycleview_191142.Student.Student;

import java.util.List;

public class RecyclerView_Adaptor extends RecyclerView.Adapter<RecyclerView_Adaptor.ViewHolder> {
   List<Student>  List1;
   Context context;

    public RecyclerView_Adaptor(List<Student> studentList, Context context) {
        this.List1 = studentList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView_Adaptor.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView_Adaptor.ViewHolder holder, int position) {
       Student student = List1.get(position);
       holder.Name.setText(student.getName());
       holder.Rollno.setText((student.getRoll_no()));
       holder.ver.setText((student.getVersion()));
    }

    @Override
    public int getItemCount() {
        return List1.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder implements  View.OnClickListener{
        TextView Name,Rollno,ver;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            Name=itemView.findViewById(R.id.Name);
            Rollno=itemView.findViewById(R.id.rollno);
            ver=itemView.findViewById(R.id.ver1);
            itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    List1.remove(getAdapterPosition());
                    notifyItemRemoved(getAdapterPosition());
                    return true;
                }
            });

        }



        @Override
        public void onClick(View v) {

        }
    }
}
