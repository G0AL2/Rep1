package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(androidx.versionedparcelable.a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f2611a = aVar.p(iconCompat.f2611a, 1);
        iconCompat.f2613c = aVar.j(iconCompat.f2613c, 2);
        iconCompat.f2614d = aVar.r(iconCompat.f2614d, 3);
        iconCompat.f2615e = aVar.p(iconCompat.f2615e, 4);
        iconCompat.f2616f = aVar.p(iconCompat.f2616f, 5);
        iconCompat.f2617g = (ColorStateList) aVar.r(iconCompat.f2617g, 6);
        iconCompat.f2619i = aVar.t(iconCompat.f2619i, 7);
        iconCompat.f2620j = aVar.t(iconCompat.f2620j, 8);
        iconCompat.n();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, androidx.versionedparcelable.a aVar) {
        aVar.x(true, true);
        iconCompat.o(aVar.f());
        int i10 = iconCompat.f2611a;
        if (-1 != i10) {
            aVar.F(i10, 1);
        }
        byte[] bArr = iconCompat.f2613c;
        if (bArr != null) {
            aVar.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f2614d;
        if (parcelable != null) {
            aVar.H(parcelable, 3);
        }
        int i11 = iconCompat.f2615e;
        if (i11 != 0) {
            aVar.F(i11, 4);
        }
        int i12 = iconCompat.f2616f;
        if (i12 != 0) {
            aVar.F(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f2617g;
        if (colorStateList != null) {
            aVar.H(colorStateList, 6);
        }
        String str = iconCompat.f2619i;
        if (str != null) {
            aVar.J(str, 7);
        }
        String str2 = iconCompat.f2620j;
        if (str2 != null) {
            aVar.J(str2, 8);
        }
    }
}
