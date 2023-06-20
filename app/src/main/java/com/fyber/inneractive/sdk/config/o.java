package com.fyber.inneractive.sdk.config;

import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import com.fyber.inneractive.sdk.util.IAlog;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ IAConfigManager f17005a;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IAConfigManager iAConfigManager = o.this.f17005a;
            iAConfigManager.f16884t.c(iAConfigManager.B);
        }
    }

    public o(IAConfigManager iAConfigManager) {
        this.f17005a = iAConfigManager;
    }

    @Override // java.lang.Runnable
    public void run() {
        IAConfigManager iAConfigManager = this.f17005a;
        if (iAConfigManager.f16881q == null) {
            Context context = iAConfigManager.f16870f;
            HashSet hashSet = new HashSet();
            InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
            List<InputMethodInfo> list = null;
            try {
                list = inputMethodManager.getEnabledInputMethodList();
            } catch (Throwable unused) {
            }
            if (list != null) {
                int i10 = 0;
                for (InputMethodInfo inputMethodInfo : list) {
                    for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(inputMethodInfo, true)) {
                        if (inputMethodSubtype.getMode().equals("keyboard") && i10 < 10) {
                            String locale = inputMethodSubtype.getLocale();
                            if (!TextUtils.isEmpty(locale)) {
                                try {
                                    String replace = locale.replace("_", Constants.FILENAME_SEQUENCE_SEPARATOR);
                                    hashSet.add(replace);
                                    IAlog.a("Available input language: %s", replace);
                                    i10++;
                                } catch (Exception unused2) {
                                }
                            }
                        }
                    }
                }
            }
            if (hashSet.isEmpty()) {
                if (Build.VERSION.SDK_INT >= 24) {
                    hashSet.addAll(Arrays.asList(LocaleList.getDefault().toLanguageTags().split(",")));
                } else {
                    Locale locale2 = Locale.getDefault();
                    if (locale2 != null) {
                        hashSet.add(locale2.toString().replace("_", Constants.FILENAME_SEQUENCE_SEPARATOR));
                    }
                }
            }
            iAConfigManager.f16881q = new ArrayList(hashSet);
        }
        com.fyber.inneractive.sdk.util.n.f20310b.post(new a());
    }
}
