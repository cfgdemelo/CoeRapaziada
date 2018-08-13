package cfgdemelo.coerapaziada;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    private int countCoe = 0;
    private static final String TAG = "MainActivity";
    private InterstitialAd mInterstitialAd;
    private long mLastBackPress;
    private static final long mBackPressThreshold = 3500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton whats1 = findViewById(R.id.shareWhats1);
        ImageButton whats2 = findViewById(R.id.shareWhats2);
        ImageButton whats3 = findViewById(R.id.shareWhats3);
        ImageButton whats4 = findViewById(R.id.shareWhats4);
        ImageButton whats5 = findViewById(R.id.shareWhats5);
        ImageButton whats6 = findViewById(R.id.shareWhats6);
        ImageButton whats7 = findViewById(R.id.shareWhats7);
        ImageButton whats8 = findViewById(R.id.shareWhats8);
        ImageButton generic1 = findViewById(R.id.shareGeneric1);
        ImageButton generic2 = findViewById(R.id.shareGeneric2);
        ImageButton generic3 = findViewById(R.id.shareGeneric3);
        ImageButton generic4 = findViewById(R.id.shareGeneric4);
        ImageButton generic5 = findViewById(R.id.shareGeneric5);
        ImageButton generic6 = findViewById(R.id.shareGeneric6);
        ImageButton generic7 = findViewById(R.id.shareGeneric7);
        ImageButton generic8 = findViewById(R.id.shareGeneric8);
        ImageButton play1 = findViewById(R.id.play1);
        ImageButton play2 = findViewById(R.id.play2);
        ImageButton play3 = findViewById(R.id.play3);
        ImageButton play4 = findViewById(R.id.play4);
        ImageButton play5 = findViewById(R.id.play5);
        ImageButton play6 = findViewById(R.id.play6);
        ImageButton play7 = findViewById(R.id.play7);
        ImageButton play8 = findViewById(R.id.play8);

        View coe1 = findViewById(R.id.coe1);
        View coe2 = findViewById(R.id.coe2);
        View coe3 = findViewById(R.id.coe3);
        View coe4 = findViewById(R.id.coe4);
        View coe5 = findViewById(R.id.coe5);
        View coe6 = findViewById(R.id.coe6);
        View coe7 = findViewById(R.id.coe7);
        View coe8 = findViewById(R.id.coe8);

        whats1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shareWhats();
            }
        });
        whats2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shareWhats();
            }
        });
        whats3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shareWhats();
            }
        });
        whats4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shareWhats();
            }
        });
        whats5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shareWhats();
            }
        });
        whats6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shareWhats();
            }
        });
        whats7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shareWhats();
            }
        });
        whats8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shareWhats();
            }
        });

        generic1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            shareGeneric();
            }
        });
        generic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            shareGeneric();
            }
        });
        generic3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            shareGeneric();
            }
        });
        generic4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            shareGeneric();
            }
        });
        generic5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            shareGeneric();
            }
        });
        generic6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            shareGeneric();
            }
        });
        generic7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            shareGeneric();
            }
        });
        generic8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            shareGeneric();
            }
        });

        coe1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rapaziada1();
            }
        });

        play1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rapaziada1();
            }
        });

        coe2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rapaziada2();
            }
        });

        play2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rapaziada2();
            }
        });

        coe3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rapaziada3();
            }
        });

        play3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rapaziada3();
            }
        });

        coe4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rapaziada4();
            }
        });

        play4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rapaziada4();
            }
        });

        coe5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rapaziada5();
            }
        });

        play5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rapaziada5();
            }
        });

        coe6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rapaziada6();
            }
        });

        play6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rapaziada6();
            }
        });

        coe7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rapaziada7();
            }
        });

        play7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rapaziada7();
            }
        });

        coe8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rapaziada8();
            }
        });

        play8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rapaziada8();
            }
        });

        AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-4492637372007210/9313602881");
        AdRequest.Builder adRequestBuilder = new AdRequest.Builder();
        mInterstitialAd.loadAd(adRequestBuilder.build());
    }

    private void shareWhats() {
        Intent it = new Intent(Intent.ACTION_SEND);
        it.setType("text/plain");
        it.setPackage("com.whatsapp");
        it.putExtra(Intent.EXTRA_TEXT, "Se divirta com os melhores áudios do Coé Rapaziada no app : https://t587b.app.goo.gl/V9Hh");
        startActivity(it);

        Toasty.info(this, "Em breve, compartilhamento do áudio", R.drawable.myavatar).show();
    }
    private void shareGeneric() {
        Intent it = new Intent(Intent.ACTION_SEND);
        it.setType("text/plain");
        it.putExtra(Intent.EXTRA_TEXT, "Se divirta com os melhores áudios do Coé Rapaziada no app : https://t587b.app.goo.gl/V9Hh");
        startActivity(Intent.createChooser(it, "Coé, compartilha com a galera"));

        Toasty.info(this, "Em breve, compartilhamento do áudio", R.drawable.myavatar).show();
    }

    private void rapaziada1() {
        MediaPlayer coeRapa1 = MediaPlayer.create(this, R.raw.coe1);
        coeRapa1.start();

        Toasty.success(this, "Aquecimento", R.drawable.myavatar).show();
        countCoe++;

        checkCountCoe(countCoe);
    }

    private void rapaziada2() {
        MediaPlayer coeRapa1 = MediaPlayer.create(this, R.raw.coe2);
        coeRapa1.start();

        Toasty.info(this, "Tá ficando bom", R.drawable.myavatar).show();
        countCoe++;

        checkCountCoe(countCoe);
    }

    private void rapaziada3() {
        MediaPlayer coeRapa1 = MediaPlayer.create(this, R.raw.coe3);
        coeRapa1.start();

        Toasty.normal(this, "Tá aumentando...", R.drawable.myavatar).show();
        countCoe++;

        checkCountCoe(countCoe);
    }

    private void rapaziada4() {
        MediaPlayer coeRapa1 = MediaPlayer.create(this, R.raw.coe4);
        coeRapa1.start();

        Toasty.warning(this, "Cuidado...", R.drawable.myavatar).show();
        countCoe++;

        checkCountCoe(countCoe);
    }

    private void rapaziada5() {
        MediaPlayer coeRapa1 = MediaPlayer.create(this, R.raw.coe5);
        coeRapa1.start();

        Toasty.warning(this, "COÉ", R.drawable.myavatar).show();
        countCoe++;

        checkCountCoe(countCoe);
    }

    private void rapaziada6() {
        MediaPlayer coeRapa1 = MediaPlayer.create(this, R.raw.coe6);
        coeRapa1.start();

        Toasty.warning(this, "C O É", R.drawable.myavatar).show();
        countCoe++;

        checkCountCoe(countCoe);
    }

    private void rapaziada7() {
        MediaPlayer coeRapa1 = MediaPlayer.create(this, R.raw.coe7);
        coeRapa1.start();

        Toasty.warning(this, "R A P A Z I A D A", R.drawable.myavatar).show();
        countCoe++;

        checkCountCoe(countCoe);
    }

    private void rapaziada8() {
        MediaPlayer coeRapa1 = MediaPlayer.create(this, R.raw.coe8);
        coeRapa1.start();

        Toasty.error(this, "HUEHUEHUEHUEHEUEHUE", R.drawable.myavatar).show();
        countCoe++;

        checkCountCoe(countCoe);
    }

    @Override
    public void onBackPressed() {
        long currentTime = System.currentTimeMillis();
        if (Math.abs(currentTime - mLastBackPress) > mBackPressThreshold) {
            mLastBackPress = currentTime;
            mInterstitialAd.show();
            Toasty.warning(this, "Coé, pressione novamente pra sair!", R.drawable.myavatar).show();
        } else {
            mInterstitialAd.show();
            super.onBackPressed();
        }
    }

    private void checkCountCoe(int countCoe) {
        if (countCoe == 10 || countCoe == 18 || countCoe == 25 || countCoe == 36) {
            mInterstitialAd.show();
        }
    }
}
