package ir.MrMohamadHosein.simpleRxjava

import SendMessage
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.disposables.Disposable

class MainActivity : AppCompatActivity() {
    lateinit var disposable: Disposable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Observable
            .just("Hi", "How R U ?", "What do U do ?", "the earth is Flat")
            .subscribe(object : Observer<String> {
                override fun onSubscribe(d: Disposable) {
                    disposable = d
                }

                override fun onNext(t: String) {
                    Log.v("testLog" , t)
                }

                override fun onError(e: Throwable) {
                    Log.v("testLog" , e.message!!)
                }

                override fun onComplete() {
                    Log.v("testLog" , "data finished")
                }

            })

    }

    override fun onDestroy() {
        super.onDestroy()
        disposable.dispose()
    }




}