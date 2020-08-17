package com.example.shefaaproject.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.shefaaproject.R;

import java.util.ArrayList;
import java.util.List;

public class ToBestLifeActivity extends AppCompatActivity {

    private String [] titles ={"كيف تحمي نفسك من الكورونا؟",
            "كيف تعتني بطفلك؟ ",
            "أمراض المناعة الذاتية",
            "نصائح للعناية بالبشرة؟",
            "نصائح للعنايه بالشعر؟",
            "نقص المناعة",
            "عسر الهضم",

            " التهاب البلعوم الحاد" , "الحساسية المفرطة" ,
            "داء السكري" , "لماذا التبرع بالدم؟" , "انخفاض ضغط الدم" ,"أمراض القلب"

    };

    private int [] images = { R.drawable.corona,R.drawable.baby,R.drawable.animiaa,R.drawable.skincare,R.drawable.skinhair,
            R.drawable.anemia,R.drawable.stomach,R.drawable.guy,R.drawable.flower,R.drawable.thing,R.drawable.blood,
          R.drawable.man, R.drawable.heart
    };

     private List<Advice> adviceList=new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_best_life);
        recyclerView=findViewById(R.id.rv_items);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        prepareList();
        RecyclerAdapter adapter=new RecyclerAdapter(adviceList);
        recyclerView.setAdapter(adapter);

    }
    private void prepareList(){
        int count = 0;
        for (String title : titles){

            Advice person = new Advice(title,images[count]);
            adviceList.add(person);
            count++;
        }

    }
}