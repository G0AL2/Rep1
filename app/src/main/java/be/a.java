package be;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import h0.d;
import java.util.Locale;
import java.util.Stack;

/* compiled from: DebugViews.java */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Matrix f5215a = new Matrix();

    @TargetApi(21)
    private static String a(Resources resources, View view) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(" ");
        sb2.append("id=");
        sb2.append(view.getId());
        sb2.append(e(resources, view));
        int visibility = view.getVisibility();
        if (visibility == 0) {
            sb2.append(", V--");
        } else if (visibility == 4) {
            sb2.append(", -I-");
        } else if (visibility != 8) {
            sb2.append(", ---");
        } else {
            sb2.append(", --G");
        }
        if (!view.getMatrix().equals(f5215a)) {
            sb2.append(", ");
            sb2.append("matrix=");
            sb2.append(view.getMatrix().toShortString());
            if (0.0f != view.getRotation() || 0.0f != view.getRotationX() || 0.0f != view.getRotationY()) {
                sb2.append(", rotate=[");
                sb2.append(view.getRotation());
                sb2.append(",");
                sb2.append(view.getRotationX());
                sb2.append(",");
                sb2.append(view.getRotationY());
                sb2.append("]");
                if (view.getWidth() / 2 != view.getPivotX() || view.getHeight() / 2 != view.getPivotY()) {
                    sb2.append(", pivot=[");
                    sb2.append(view.getPivotX());
                    sb2.append(",");
                    sb2.append(view.getPivotY());
                    sb2.append("]");
                }
            }
            if (Build.VERSION.SDK_INT >= 21 && (0.0f != view.getTranslationX() || 0.0f != view.getTranslationY() || 0.0f != view.getTranslationZ())) {
                sb2.append(", translate=[");
                sb2.append(view.getTranslationX());
                sb2.append(",");
                sb2.append(view.getTranslationY());
                sb2.append(",");
                sb2.append(view.getTranslationZ());
                sb2.append("]");
            }
            if (1.0f != view.getScaleX() || 1.0f != view.getScaleY()) {
                sb2.append(", scale=[");
                sb2.append(view.getScaleX());
                sb2.append(",");
                sb2.append(view.getScaleY());
                sb2.append("]");
            }
        }
        if (view.getPaddingStart() != 0 || view.getPaddingTop() != 0 || view.getPaddingEnd() != 0 || view.getPaddingBottom() != 0) {
            sb2.append(", ");
            sb2.append("padding=[");
            sb2.append(view.getPaddingStart());
            sb2.append(",");
            sb2.append(view.getPaddingTop());
            sb2.append(",");
            sb2.append(view.getPaddingEnd());
            sb2.append(",");
            sb2.append(view.getPaddingBottom());
            sb2.append("]");
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams.leftMargin != 0 || marginLayoutParams.topMargin != 0 || marginLayoutParams.rightMargin != 0 || marginLayoutParams.bottomMargin != 0) {
                sb2.append(", ");
                sb2.append("margin=[");
                sb2.append(marginLayoutParams.leftMargin);
                sb2.append(",");
                sb2.append(marginLayoutParams.topMargin);
                sb2.append(",");
                sb2.append(marginLayoutParams.rightMargin);
                sb2.append(",");
                sb2.append(marginLayoutParams.bottomMargin);
                sb2.append("]");
            }
        }
        sb2.append(", position=[");
        sb2.append(view.getLeft());
        sb2.append(",");
        sb2.append(view.getTop());
        sb2.append("]");
        sb2.append(", size=[");
        sb2.append(view.getWidth());
        sb2.append(",");
        sb2.append(view.getHeight());
        sb2.append("]");
        if (view instanceof TextView) {
            sb2.append(", text=\"");
            sb2.append(((TextView) view).getText());
            sb2.append("\"");
        }
        return sb2.toString();
    }

    public static String b(Activity activity) {
        View findViewById = activity.findViewById(16908290);
        if (findViewById == null) {
            return "Activity [" + activity.getClass().getSimpleName() + "] is not initialized yet. ";
        }
        return c(findViewById);
    }

    private static String c(View view) {
        StringBuilder sb2 = new StringBuilder((int) Constants.BUFFER_SIZE);
        sb2.append("\n");
        Resources resources = view.getResources();
        Stack stack = new Stack();
        stack.push(d.a("", view));
        while (!stack.empty()) {
            d dVar = (d) stack.pop();
            View view2 = (View) dVar.f31050b;
            String str = (String) dVar.f31049a;
            boolean z10 = stack.empty() || !str.equals(((d) stack.peek()).f31049a);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("");
            sb3.append(str);
            sb3.append(z10 ? "└── " : "├── ");
            sb2.append(sb3.toString() + view2.getClass().getSimpleName() + a(resources, view2));
            sb2.append("\n");
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str);
                    sb4.append(z10 ? "    " : "│   ");
                    stack.push(d.a(sb4.toString(), viewGroup.getChildAt(childCount)));
                }
            }
        }
        return sb2.toString();
    }

    public static int d(String str, String str2) {
        int i10 = 0;
        while (str2.length() > 0) {
            int indexOf = str2.indexOf("\n");
            int min = Math.min(str2.length(), Math.min(indexOf < 0 ? 200 : indexOf + 1, 200));
            Log.d(str, String.format(Locale.US, "%02d: %s", Integer.valueOf(i10), str2.substring(0, min)));
            str2 = str2.substring(min);
            i10++;
        }
        return i10;
    }

    private static String e(Resources resources, View view) {
        if (resources == null) {
            return "";
        }
        try {
            return " / " + resources.getResourceEntryName(view.getId());
        } catch (Throwable unused) {
            return "";
        }
    }
}
