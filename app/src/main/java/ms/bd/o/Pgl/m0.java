package ms.bd.o.Pgl;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public final class m0 implements SensorEventListener {

    /* renamed from: f  reason: collision with root package name */
    private static volatile m0 f34534f;

    /* renamed from: a  reason: collision with root package name */
    private SensorManager f34535a;

    /* renamed from: b  reason: collision with root package name */
    private int f34536b;

    /* renamed from: c  reason: collision with root package name */
    private int f34537c = 0;

    /* renamed from: d  reason: collision with root package name */
    private float[] f34538d = new float[3];

    /* renamed from: e  reason: collision with root package name */
    private List<JSONArray> f34539e = new ArrayList();

    static {
        new DecimalFormat((String) pblk.a(16777217, 0, 0L, "b46093", new byte[]{35, 120, 21}));
        f34534f = null;
    }

    private m0(Context context) {
        this.f34535a = null;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            this.f34535a = (SensorManager) applicationContext.getSystemService((String) pblk.a(16777217, 0, 0L, "e325e0", new byte[]{103, 52, 79, 82, 85, 53}));
        }
    }

    public static m0 a(Context context) {
        if (f34534f == null) {
            synchronized (m0.class) {
                if (f34534f == null) {
                    f34534f = new m0(context);
                }
            }
        }
        return f34534f;
    }

    private synchronized void c() {
        try {
            SensorManager sensorManager = this.f34535a;
            if (sensorManager != null) {
                int i10 = this.f34536b - 1;
                this.f34536b = i10;
                if (i10 == 0) {
                    sensorManager.unregisterListener(this);
                }
            }
        } catch (Exception unused) {
            String str = (String) pblk.a(16777217, 0, 0L, "2fe8b7", new byte[]{48, 119, 21, 115, 72});
        }
    }

    public synchronized void a() {
        char c10;
        JSONArray jSONArray;
        JSONArray jSONArray2;
        try {
            c10 = pblz.a() != null ? (char) 1 : (char) 0;
        } catch (Throwable unused) {
            c10 = 65535;
        }
        if (c10 != 1) {
            jSONArray2 = null;
        } else {
            synchronized (this) {
                try {
                    SensorManager sensorManager = this.f34535a;
                    if (sensorManager != null && (this.f34536b != 0 || this.f34535a.registerListener(this, sensorManager.getDefaultSensor(1), 3))) {
                        this.f34536b++;
                    }
                } catch (Exception unused2) {
                }
                try {
                    synchronized (this) {
                        int i10 = 0;
                        while (this.f34537c == 0 && i10 < 10) {
                            i10++;
                            wait(1000L);
                        }
                    }
                } catch (Exception unused3) {
                    String str = (String) pblk.a(16777217, 0, 0L, "7ad6ed", new byte[]{53, 112, 20, 125, 93});
                    jSONArray = new JSONArray();
                    jSONArray.put(new BigDecimal(this.f34538d[0]).setScale(2, 4));
                    jSONArray.put(new BigDecimal(this.f34538d[1]).setScale(2, 4));
                    jSONArray.put(new BigDecimal(this.f34538d[2]).setScale(2, 4));
                    c();
                }
            }
            jSONArray = new JSONArray();
            jSONArray.put(new BigDecimal(this.f34538d[0]).setScale(2, 4));
            jSONArray.put(new BigDecimal(this.f34538d[1]).setScale(2, 4));
            jSONArray.put(new BigDecimal(this.f34538d[2]).setScale(2, 4));
            c();
            this.f34537c = 0;
            jSONArray2 = jSONArray;
        }
        if (jSONArray2 == null) {
            return;
        }
        this.f34539e.add(jSONArray2);
        try {
            int size = this.f34539e.size();
            if (size > 100) {
                ArrayList arrayList = new ArrayList(this.f34539e.subList(size - 50, size));
                this.f34539e.clear();
                this.f34539e = arrayList;
            }
        } catch (Throwable unused4) {
        }
    }

    public synchronized String b() {
        StringBuilder sb2 = new StringBuilder();
        int size = this.f34539e.size();
        if (size <= 0) {
            return null;
        }
        try {
            List<JSONArray> list = this.f34539e;
            int i10 = size - 50;
            if (i10 <= 0) {
                i10 = 0;
            }
            List<JSONArray> subList = list.subList(i10, size);
            if (subList.size() > 0) {
                for (JSONArray jSONArray : subList) {
                    if (jSONArray != null) {
                        sb2.append(jSONArray.get(0).toString());
                        sb2.append((String) pblk.a(16777217, 0, 0L, "49c8ab", new byte[]{105}));
                        sb2.append(jSONArray.get(1).toString());
                        sb2.append((String) pblk.a(16777217, 0, 0L, "84121b", new byte[]{101}));
                        sb2.append(jSONArray.get(2).toString());
                        sb2.append((String) pblk.a(16777217, 0, 0L, "012d18", new byte[]{61}));
                    }
                }
            }
            if (sb2.length() > 0) {
                sb2.delete(sb2.length() - 1, sb2.length());
            }
        } catch (Throwable unused) {
        }
        return sb2.toString();
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        this.f34538d = sensorEvent.values;
        this.f34537c = 1;
    }
}
