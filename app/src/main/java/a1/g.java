package a1;

import android.database.sqlite.SQLiteProgram;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import qe.k;
import z0.i;

/* compiled from: FrameworkSQLiteProgram.kt */
/* loaded from: classes.dex */
public class g implements i {

    /* renamed from: a  reason: collision with root package name */
    private final SQLiteProgram f39a;

    public g(SQLiteProgram sQLiteProgram) {
        k.f(sQLiteProgram, "delegate");
        this.f39a = sQLiteProgram;
    }

    @Override // z0.i
    public void A0(int i10, long j10) {
        this.f39a.bindLong(i10, j10);
    }

    @Override // z0.i
    public void D0(int i10, byte[] bArr) {
        k.f(bArr, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.f39a.bindBlob(i10, bArr);
    }

    @Override // z0.i
    public void P0(int i10) {
        this.f39a.bindNull(i10);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f39a.close();
    }

    @Override // z0.i
    public void g(int i10, double d10) {
        this.f39a.bindDouble(i10, d10);
    }

    @Override // z0.i
    public void p0(int i10, String str) {
        k.f(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.f39a.bindString(i10, str);
    }
}
