package com.inmobi.media;

import android.os.SystemClock;
import com.inmobi.media.fy;
import java.util.Map;

/* compiled from: ConfigNetworkClient.java */
/* loaded from: classes3.dex */
class fw implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private static final String f25500a = fw.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private fx f25501b;

    /* renamed from: c  reason: collision with root package name */
    private a f25502c;

    /* renamed from: d  reason: collision with root package name */
    private final fx f25503d;

    /* compiled from: ConfigNetworkClient.java */
    /* loaded from: classes3.dex */
    public interface a {
        void a(fy.a aVar);

        void a(String str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public fw(a aVar, fx fxVar, fx fxVar2) {
        this.f25502c = aVar;
        this.f25501b = fxVar;
        this.f25503d = fxVar2;
    }

    private void a(fx fxVar, Map<String, fy.a> map) {
        for (Map.Entry<String, fy.a> entry : map.entrySet()) {
            fy.a value = entry.getValue();
            String key = entry.getKey();
            if (!value.a()) {
                this.f25502c.a(value);
                fxVar.f25509c.remove(key);
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        Map<String, fy.a> map;
        Map<String, fy.a> map2;
        int i10 = 0;
        int i11 = 0;
        do {
            try {
                fx fxVar = this.f25501b;
                if (i11 > fxVar.f25507a) {
                    break;
                }
                fy a10 = a(fxVar);
                map = a10.f25511a;
                if (a10.a() && this.f25503d != null) {
                    do {
                        fx fxVar2 = this.f25503d;
                        if (i10 > fxVar2.f25507a) {
                            break;
                        }
                        fy a11 = a(fxVar2);
                        map2 = a11.f25511a;
                        if (!a11.a()) {
                            a(this.f25503d, map2);
                            if (this.f25503d.f25509c.isEmpty()) {
                                break;
                            }
                            i10++;
                        } else {
                            break;
                        }
                    } while (!a(this.f25503d, i10, map2));
                    this.f25502c.a(this.f25503d.b());
                    return;
                }
                a(this.f25501b, map);
                if (this.f25501b.f25509c.isEmpty()) {
                    break;
                }
                i11++;
            } catch (InterruptedException unused) {
                return;
            }
        } while (!a(this.f25501b, i11, map));
        this.f25502c.a(this.f25501b.b());
    }

    private static fy a(fx fxVar) {
        return new fy(fxVar, new ha(fxVar).a(), SystemClock.elapsedRealtime() - SystemClock.elapsedRealtime());
    }

    private boolean a(fx fxVar, int i10, Map<String, fy.a> map) throws InterruptedException {
        if (i10 > fxVar.f25507a) {
            for (Map.Entry<String, fr> entry : fxVar.f25509c.entrySet()) {
                String key = entry.getKey();
                if (map.containsKey(key)) {
                    this.f25502c.a(map.get(key));
                }
            }
            return true;
        }
        Thread.sleep(fxVar.f25508b * 1000);
        return false;
    }
}
