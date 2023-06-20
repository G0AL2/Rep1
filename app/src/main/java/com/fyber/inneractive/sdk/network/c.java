package com.fyber.inneractive.sdk.network;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c implements com.fyber.inneractive.sdk.util.o0 {

    /* renamed from: d  reason: collision with root package name */
    public Handler f17528d;

    /* renamed from: e  reason: collision with root package name */
    public int f17529e;

    /* renamed from: a  reason: collision with root package name */
    public final BlockingQueue<JSONObject> f17525a = new LinkedBlockingQueue();

    /* renamed from: b  reason: collision with root package name */
    public JSONArray f17526b = new JSONArray();

    /* renamed from: f  reason: collision with root package name */
    public boolean f17530f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f17531g = false;

    /* renamed from: c  reason: collision with root package name */
    public final HandlerThread f17527c = new HandlerThread("EventCollectorHandlerThread", 0);

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f17532a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ long f17533b;

        public a(int i10, long j10) {
            this.f17532a = i10;
            this.f17533b = j10;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.f17528d.sendEmptyMessageDelayed(this.f17532a, this.f17533b);
        }
    }

    public final void a(int i10, long j10) {
        Handler handler = this.f17528d;
        if (handler != null) {
            handler.post(new a(i10, j10));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v21, types: [org.json.JSONObject] */
    @Override // com.fyber.inneractive.sdk.util.o0
    public void handleMessage(Message message) {
        String str;
        int i10 = message.what;
        if (i10 == 12312329 || i10 == 20150330) {
            if (this.f17530f && this.f17525a.size() > 0) {
                while (true) {
                    str = null;
                    if (this.f17525a.size() <= 0) {
                        break;
                    }
                    try {
                        str = this.f17525a.poll();
                    } catch (Throwable unused) {
                    }
                    if (str != null) {
                        this.f17526b.put(str);
                    }
                }
                if (this.f17526b.length() > 0) {
                    JSONArray jSONArray = this.f17526b;
                    String b10 = com.fyber.inneractive.sdk.config.a.b();
                    long currentTimeMillis = System.currentTimeMillis();
                    try {
                        str = jSONArray.toString();
                    } catch (Throwable unused2) {
                    }
                    if (str != null) {
                        g0 g0Var = new g0(new e(this, b10, jSONArray, currentTimeMillis), b10, str, v.b().a());
                        IAConfigManager.J.f16884t.f17705a.offer(g0Var);
                        g0Var.a(m0.QUEUED);
                    }
                    this.f17526b = new JSONArray();
                }
            }
            Handler handler = this.f17528d;
            if (handler != null) {
                handler.removeMessages(12312329);
                a(12312329, this.f17529e * 1000);
            }
        }
    }
}
