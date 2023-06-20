package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* compiled from: AppCompatTextClassifierHelper.java */
/* loaded from: classes.dex */
final class a0 {

    /* renamed from: a  reason: collision with root package name */
    private TextView f1379a;

    /* renamed from: b  reason: collision with root package name */
    private TextClassifier f1380b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0(TextView textView) {
        this.f1379a = (TextView) h0.g.f(textView);
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.f1380b;
        if (textClassifier == null) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) this.f1379a.getContext().getSystemService(TextClassificationManager.class);
            if (textClassificationManager != null) {
                return textClassificationManager.getTextClassifier();
            }
            return TextClassifier.NO_OP;
        }
        return textClassifier;
    }

    public void b(TextClassifier textClassifier) {
        this.f1380b = textClassifier;
    }
}
