    package com.example.weswing;

    import androidx.appcompat.app.AppCompatActivity;

    import android.content.Intent;
    import android.media.Image;
    import android.os.Bundle;
    import android.view.View;
    import android.widget.Button;
    import android.widget.ImageButton;

    import androidx.appcompat.widget.Toolbar;

    public class Register extends AppCompatActivity {

        Toolbar title_register;
        ImageButton back;
        Button registered;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_register);

            title_register = findViewById(R.id.toolbar_register);
            back = findViewById(R.id.back_button);
            back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(Register.this, Menu.class);
                    startActivity(i);
                }
            });
            registered = findViewById(R.id.button2);
            registered.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent a = new Intent(Register.this, Menu.class);
                    startActivity(a);
                }
            });


        }


    }