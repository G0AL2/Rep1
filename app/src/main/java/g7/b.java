package g7;

import android.os.SystemClock;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: OnScrollDispatchHelper.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private int f30597a = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: b  reason: collision with root package name */
    private int f30598b = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: c  reason: collision with root package name */
    private float f30599c = 0.0f;

    /* renamed from: d  reason: collision with root package name */
    private float f30600d = 0.0f;

    /* renamed from: e  reason: collision with root package name */
    private long f30601e = -11;

    public float a() {
        return this.f30599c;
    }

    public float b() {
        return this.f30600d;
    }

    public boolean c(int i10, int i11) {
        long uptimeMillis = SystemClock.uptimeMillis();
        long j10 = this.f30601e;
        boolean z10 = (uptimeMillis - j10 <= 10 && this.f30597a == i10 && this.f30598b == i11) ? false : true;
        if (uptimeMillis - j10 != 0) {
            this.f30599c = (i10 - this.f30597a) / ((float) (uptimeMillis - j10));
            this.f30600d = (i11 - this.f30598b) / ((float) (uptimeMillis - j10));
        }
        this.f30601e = uptimeMillis;
        this.f30597a = i10;
        this.f30598b = i11;
        return z10;
    }
}
