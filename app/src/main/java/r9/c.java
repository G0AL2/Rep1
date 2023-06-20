package r9;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import jb.s;

/* compiled from: CueDecoder.java */
/* loaded from: classes2.dex */
public final class c {
    public s<b> a(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
        obtain.recycle();
        return ea.b.b(b.f36482s, (ArrayList) ea.a.e(readBundle.getParcelableArrayList(l6.c.f33710i)));
    }
}
