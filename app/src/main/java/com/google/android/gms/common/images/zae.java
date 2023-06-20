package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.base.zai;
import com.google.android.gms.internal.base.zaj;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public final class zae extends zag {
    private final WeakReference<ImageView> zac;

    public zae(ImageView imageView, int i10) {
        super(Uri.EMPTY, i10);
        Asserts.checkNotNull(imageView);
        this.zac = new WeakReference<>(imageView);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zae) {
            ImageView imageView = this.zac.get();
            ImageView imageView2 = ((zae) obj).zac.get();
            return (imageView2 == null || imageView == null || !Objects.equal(imageView2, imageView)) ? false : true;
        }
        return false;
    }

    public final int hashCode() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.images.zag
    public final void zaa(Drawable drawable, boolean z10, boolean z11, boolean z12) {
        ImageView imageView = this.zac.get();
        if (imageView != null) {
            if (!z11 && !z12 && (imageView instanceof zaj)) {
                zaj zajVar = (zaj) imageView;
                throw null;
            }
            boolean z13 = false;
            if (!z11 && !z10) {
                z13 = true;
            }
            if (z13) {
                Drawable drawable2 = imageView.getDrawable();
                if (drawable2 == null) {
                    drawable2 = null;
                } else if (drawable2 instanceof zai) {
                    drawable2 = ((zai) drawable2).zaa();
                }
                drawable = new zai(drawable2, drawable);
            }
            imageView.setImageDrawable(drawable);
            if (imageView instanceof zaj) {
                zaj zajVar2 = (zaj) imageView;
                throw null;
            } else if (drawable == null || !z13) {
            } else {
                ((zai) drawable).zab(IronSourceConstants.INTERSTITIAL_DAILY_CAPPED);
            }
        }
    }

    public zae(ImageView imageView, Uri uri) {
        super(uri, 0);
        Asserts.checkNotNull(imageView);
        this.zac = new WeakReference<>(imageView);
    }
}
