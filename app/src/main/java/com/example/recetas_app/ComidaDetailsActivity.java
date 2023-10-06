package com.example.recetas_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ComidaDetailsActivity extends AppCompatActivity {

    private ImageView imgComida;
    private TextView txtNombreComida;
    private TextView txtDescripcionComida;
    private TextView txtRecetaComida;
    private Button btnCompartir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comida_details);

        imgComida = findViewById(R.id.imgComida);
        txtNombreComida = findViewById(R.id.txtNombreComida);
        txtDescripcionComida = findViewById(R.id.txtDescripcionComida);
        txtRecetaComida = findViewById(R.id.txtRecetaComida);
        btnCompartir = findViewById(R.id.btnCompartir);

        Intent intent = getIntent();
        if (intent != null) {
            String category = intent.getStringExtra("category");
            String food = intent.getStringExtra("food");

            cargarDetallesComidaYReceta(food);

            btnCompartir.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    compartirComida(food);
                }
            });
        }
    }

    private void cargarDetallesComidaYReceta(String food) {
        if (food.equals("Tacos")) {
            imgComida.setImageResource(R.drawable.tacos);
            txtNombreComida.setText("Tacos");
            txtDescripcionComida.setText("Deliciosos tacos mexicanos.");
            txtRecetaComida.setText(getResources().getString(R.string.receta_tacos));
        } else if (food.equals("Sushi")) {
            imgComida.setImageResource(R.drawable.sushi);
            txtNombreComida.setText("Sushi");
            txtDescripcionComida.setText("Sushi japonés fresco.");
            txtRecetaComida.setText(getResources().getString(R.string.receta_sushi));
        } else if (food.equals("Pizza")) {
            imgComida.setImageResource(R.drawable.pizza);
            txtNombreComida.setText("Pizza");
            txtDescripcionComida.setText("Pizza italiana recién horneada.");
            txtRecetaComida.setText(getResources().getString(R.string.receta_pizza));
        } else if (food.equals("Omelette")) {
            imgComida.setImageResource(R.drawable.omellete);
            txtNombreComida.setText("Omelette");
            txtDescripcionComida.setText("Rico omelette");
            txtRecetaComida.setText(getResources().getString(R.string.receta_omellete));
        } else if (food.equals("Hot Cakes Clásicos")){
            imgComida.setImageResource(R.drawable.hotcakes);
            txtNombreComida.setText("Hot Cakes Clasicos");
            txtDescripcionComida.setText("Ricos Hot Cakes para compartir");
            txtRecetaComida.setText(getResources().getString(R.string.receta_hot_cakes_clasicos));
        } else if (food.equals("Tamales de Calabaza")) {
            imgComida.setImageResource(R.drawable.tamales_cala);
            txtNombreComida.setText("Tamales de Calabaza");
            txtDescripcionComida.setText("Ricos tamales de calabaza.");
            txtRecetaComida.setText(getResources().getString(R.string.receta_tamales_de_calabaza));
        } else if (food.equals("Licuado de Plátano con Avena")){
            imgComida.setImageResource(R.drawable.batido_banana);
            txtNombreComida.setText("Licuado de Plátano con Avena");
            txtDescripcionComida.setText("Rico batido de platano y avena.");
            txtRecetaComida.setText(getResources().getString(R.string.receta_licuado_de_platano_con_avena));
        } else if (food.equals("Hamburguesa")){
            imgComida.setImageResource(R.drawable.hamburguesa);
            txtNombreComida.setText("Hamburguesa");
            txtDescripcionComida.setText("Rica hamburguesa para compartir.");
            txtRecetaComida.setText(getResources().getString(R.string.receta_hamburguesa));
        } else if (food.equals("Pasta")){
            imgComida.setImageResource(R.drawable.pasta);
            txtNombreComida.setText("Pasta");
            txtDescripcionComida.setText("Ricos espaguetis.");
            txtRecetaComida.setText(getResources().getString(R.string.receta_pasta));
        } else if (food.equals("Pasteles en hoja")){
            imgComida.setImageResource(R.drawable.pastel_en_hoja);
            txtNombreComida.setText("Pasteles en hoja");
            txtDescripcionComida.setText("Disfruta de este rico plato dominicano.");
            txtRecetaComida.setText(getResources().getString(R.string.receta_pasteles_en_hoja));
        } else if (food.equals("Pastelon de platano maduro")){
            imgComida.setImageResource(R.drawable.pastelon);
            txtNombreComida.setText("Pastelon de platano maduro");
            txtDescripcionComida.setText("Disfruta de este rico plato dominicano.");
            txtRecetaComida.setText(getResources().getString(R.string.Pastelon_de_Platano_Maduro));
        } else if (food.equals("Niño envuelto dominicano")){
            imgComida.setImageResource(R.drawable.nino_envuelto);
            txtNombreComida.setText("Niño envuelto dominicano");
            txtDescripcionComida.setText("Disfruta de este rico plato dominicano.");
            txtRecetaComida.setText(getResources().getString(R.string.receta_nino_envuelto_dominicano));
        } else if (food.equals("Crema de verduras con espárragos y espinacas")){
            imgComida.setImageResource(R.drawable.verduras_crema);
            txtNombreComida.setText("Crema de verduras con espárragos y espinacas");
            txtDescripcionComida.setText("Disfruta de este rico plato muy rico y dietetico.");
            txtRecetaComida.setText(getResources().getString(R.string.recete_crema_de_verduras_con_espárragos_y_espinacas));
        } else if (food.equals("Sopa de verduras en juliana")){
            imgComida.setImageResource(R.drawable.sopa_juliana);
            txtNombreComida.setText("Sopa de verduras en juliana");
            txtDescripcionComida.setText("Disfruta de esta rica sopa muy rica y facil de hacer.");
            txtRecetaComida.setText(getResources().getString(R.string.receta_sopa_de_verduras_en_juliana));
        } else if (food.equals("Crema de calabacín")){
            imgComida.setImageResource(R.drawable.crema_calabacin);
            txtNombreComida.setText("Crema de calabacín");
            txtDescripcionComida.setText("Disfruta de esta crema de calabaza muy facil de hacer.");
            txtRecetaComida.setText(getResources().getString(R.string.receta_Crema_de_calabacín_fácil));
        } else if (food.equals("Helado")){
            imgComida.setImageResource(R.drawable.helado);
            txtNombreComida.setText("Helado");
            txtDescripcionComida.setText("Aprende a preparar este rico platillo para degustar muy querido por los niños.");
            txtRecetaComida.setText(getResources().getString(R.string.receta_helado));
        } else if (food.equals("Tarta de Chocolate")){
            imgComida.setImageResource(R.drawable.tarta_de_chocolate);
            txtNombreComida.setText("Tarta de chocolate");
            txtDescripcionComida.setText("Rica tarta de chocolate para endulzar tus momentos.");
            txtRecetaComida.setText(getResources().getString(R.string.receta_tarta_de_Chocolate));
        } else if (food.equals("Brownie de chocolate")){
            imgComida.setImageResource(R.drawable.brownie_choc);
            txtNombreComida.setText("Brownie de chocolate");
            txtDescripcionComida.setText("Rico brownie de chocolate para endulzar tus momentos.");
            txtRecetaComida.setText(getResources().getString(R.string.receta_Brownie_de_Chocolate));
        } else if (food.equals("Churros caseros")){
            imgComida.setImageResource(R.drawable.churros_caseros);
            txtNombreComida.setText("Churros caseros");
            txtDescripcionComida.setText("Aprende a hacer estos ricos churros caseros para compartir con familia u amigos.");
            txtRecetaComida.setText(getResources().getString(R.string.receta_Churros_Caseros));
        } else if (food.equals("Dulce de leche casero")){
            imgComida.setImageResource(R.drawable.dulce_de_leche);
            txtNombreComida.setText("Dulce de leche caseros");
            txtDescripcionComida.setText("Aprende a hacer este dulce para degustar y hacer feliz tus dias, tardes o noches.");
            txtRecetaComida.setText(getResources().getString(R.string.receta_dulce_de_Leche_Casero));
        }
        // Puedes agregar más comidas y recetas correspondientes aquí
    }

    private void compartirComida(String food) {
        String mensaje = "¡Mira esta deliciosa " + food + " que encontré!";
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, mensaje);
        startActivity(Intent.createChooser(intent, "Compartir comida"));
    }
}