package androidx.constraintlayout.motion.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import fm.castbox.mediation.model.NetworkName;

/* compiled from: Debug.java */
@SuppressLint({"LogConditional"})
/* loaded from: classes.dex */
public class a {
    public static String a(Context context, int i10) {
        if (i10 != -1) {
            try {
                return context.getResources().getResourceEntryName(i10);
            } catch (Exception unused) {
                return "?" + i10;
            }
        }
        return NetworkName.UNKNOWN;
    }

    public static String b(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return NetworkName.UNKNOWN;
        }
    }
}
