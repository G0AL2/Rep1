package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public class ViewUtils {
    private ViewUtils() {
    }

    @KeepForSdk
    public static String getXmlAttributeString(String str, String str2, Context context, AttributeSet attributeSet, boolean z10, boolean z11, String str3) {
        String attributeValue = attributeSet == null ? null : attributeSet.getAttributeValue(str, str2);
        if (attributeValue != null && attributeValue.startsWith("@string/") && z10) {
            String substring = attributeValue.substring(8);
            String packageName = context.getPackageName();
            TypedValue typedValue = new TypedValue();
            try {
                Resources resources = context.getResources();
                StringBuilder sb2 = new StringBuilder(String.valueOf(packageName).length() + 8 + String.valueOf(substring).length());
                sb2.append(packageName);
                sb2.append(":string/");
                sb2.append(substring);
                resources.getValue(sb2.toString(), typedValue, true);
            } catch (Resources.NotFoundException unused) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(str2).length() + 30 + attributeValue.length());
                sb3.append("Could not find resource for ");
                sb3.append(str2);
                sb3.append(": ");
                sb3.append(attributeValue);
                Log.w(str3, sb3.toString());
            }
            CharSequence charSequence = typedValue.string;
            if (charSequence != null) {
                attributeValue = charSequence.toString();
            } else {
                String obj = typedValue.toString();
                StringBuilder sb4 = new StringBuilder(String.valueOf(str2).length() + 28 + obj.length());
                sb4.append("Resource ");
                sb4.append(str2);
                sb4.append(" was not a string: ");
                sb4.append(obj);
                Log.w(str3, sb4.toString());
            }
        }
        if (z11 && attributeValue == null) {
            StringBuilder sb5 = new StringBuilder(String.valueOf(str2).length() + 33);
            sb5.append("Required XML attribute \"");
            sb5.append(str2);
            sb5.append("\" missing");
            Log.w(str3, sb5.toString());
        }
        return attributeValue;
    }
}
