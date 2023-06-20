package c;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;

/* compiled from: ActivityResultContracts.java */
/* loaded from: classes.dex */
public final class c extends a<Intent, ActivityResult> {
    @Override // c.a
    /* renamed from: d */
    public Intent a(Context context, Intent intent) {
        return intent;
    }

    @Override // c.a
    /* renamed from: e */
    public ActivityResult c(int i10, Intent intent) {
        return new ActivityResult(i10, intent);
    }
}
