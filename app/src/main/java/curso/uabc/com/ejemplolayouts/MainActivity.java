package curso.uabc.com.ejemplolayouts;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends ActionBarActivity implements AdapterView.OnItemClickListener {

    private ListView lstOpciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Lista de datos que se muestra en la ListView
        final String[] datos =
                new String[]{"Relative","Grid","Table","Linear(Vertical)","Linear(Horizontal)","Frame"};
        //Adaptador generico que permite mostrar contenido en la lista
        ArrayAdapter<String> adaptador =
                new ArrayAdapter<String>(this,
                        android.R.layout.simple_list_item_1, datos);
        //Se obtiene el ListView del Layout mediante su ID
        lstOpciones = (ListView)findViewById(R.id.listaOpciones);
        //Se asigna el Adaptador
        lstOpciones.setAdapter(adaptador);
        //Se asigna el escuchador de eventos en los items de la lista
        lstOpciones.setOnItemClickListener(this);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

/**
 * Metodo escuchador de eventos sobre los items de la lista.
 * @param padre Adaptador de la vista
 * @param  vista vista actual
 * @param  posicion posicion donde se creo el evento
 * @param  identificador  identificador del item seleccionado
 * */
    @Override
    public void onItemClick(AdapterView<?> padre, View vista, int posicion, long identificador) {
        switch (posicion){

                case 0:
                    Intent navegadorA=new Intent(this,EjemploRelativeLayout.class);
                    startActivity(navegadorA);
                break;
                case 1:
                    Intent navegadorB=new Intent(this,EjemploGridLayout.class);
                    startActivity(navegadorB);
                    break;
                case 2:
                    Intent navegadorC=new Intent(this,EjemploTableLayout.class);
                    startActivity(navegadorC);
                    break;
                case 3:
                    Intent navegadorD=new Intent(this,EjemploLinearLayout.class);
                    startActivity(navegadorD);
                    break;
                case 4:
                    Intent navegadorE=new Intent(this,EjemploLinearLayout2.class);
                    startActivity(navegadorE);
                    break;
            case 5:
                Intent navegadorF=new Intent(this,EjemploFrameLayout.class);
                startActivity(navegadorF);
                break;
                default:
                    break;

            }

    }
}
