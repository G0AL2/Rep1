package com.google.android.ads.mediationtestsuite.dataobjects;

import android.content.Context;
import android.util.Log;
import com.google.android.ads.mediationtestsuite.g;
import com.google.android.ads.mediationtestsuite.utils.k;
import com.google.android.ads.mediationtestsuite.viewmodels.TestState;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum FAILURE_INTERNAL_ERROR uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:289)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public final class TestResult {
    private static final /* synthetic */ TestResult[] $VALUES;
    public static final TestResult FAILURE_INTERNAL_ERROR;
    public static final TestResult FAILURE_INVALID_REQUEST;
    public static final TestResult FAILURE_NETWORK_ERROR;
    public static final TestResult FAILURE_NO_FILL;
    public static final TestResult FAILURE_UNABLE_TO_TEST;
    public static final int FAIL_COLOR = -30584;
    public static final int NEUTRAL_COLOR = -4473925;
    public static final int OK_COLOR = -7798904;
    private final TestState testState;
    public static final TestResult UNTESTED = new TestResult("UNTESTED", 0, TestState.f20947i);
    public static final TestResult SUCCESS = new TestResult("SUCCESS", 1, TestState.f20946h);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.ads.mediationtestsuite.dataobjects.TestResult$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$android$ads$mediationtestsuite$dataobjects$TestResult;

        static {
            int[] iArr = new int[TestResult.values().length];
            $SwitchMap$com$google$android$ads$mediationtestsuite$dataobjects$TestResult = iArr;
            try {
                iArr[TestResult.UNTESTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$android$ads$mediationtestsuite$dataobjects$TestResult[TestResult.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$android$ads$mediationtestsuite$dataobjects$TestResult[TestResult.FAILURE_INTERNAL_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$android$ads$mediationtestsuite$dataobjects$TestResult[TestResult.FAILURE_INVALID_REQUEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$android$ads$mediationtestsuite$dataobjects$TestResult[TestResult.FAILURE_NETWORK_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$android$ads$mediationtestsuite$dataobjects$TestResult[TestResult.FAILURE_NO_FILL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$android$ads$mediationtestsuite$dataobjects$TestResult[TestResult.FAILURE_UNABLE_TO_TEST.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private static /* synthetic */ TestResult[] $values() {
        return new TestResult[]{UNTESTED, SUCCESS, FAILURE_INTERNAL_ERROR, FAILURE_INVALID_REQUEST, FAILURE_NETWORK_ERROR, FAILURE_NO_FILL, FAILURE_UNABLE_TO_TEST};
    }

    static {
        TestState testState = TestState.f20944f;
        FAILURE_INTERNAL_ERROR = new TestResult("FAILURE_INTERNAL_ERROR", 2, testState);
        FAILURE_INVALID_REQUEST = new TestResult("FAILURE_INVALID_REQUEST", 3, testState);
        FAILURE_NETWORK_ERROR = new TestResult("FAILURE_NETWORK_ERROR", 4, testState);
        FAILURE_NO_FILL = new TestResult("FAILURE_NO_FILL", 5, testState);
        FAILURE_UNABLE_TO_TEST = new TestResult("FAILURE_UNABLE_TO_TEST", 6, testState);
        $VALUES = $values();
    }

    private TestResult(String str, int i10, TestState testState) {
        this.testState = testState;
    }

    public static TestResult getFailureResult(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        Log.d("gma_test", "Unknown error encountered. Defaulting to untested.");
                        return UNTESTED;
                    }
                    return FAILURE_NO_FILL;
                }
                return FAILURE_NETWORK_ERROR;
            }
            return FAILURE_INVALID_REQUEST;
        }
        return FAILURE_INTERNAL_ERROR;
    }

    public static TestResult valueOf(String str) {
        return (TestResult) Enum.valueOf(TestResult.class, str);
    }

    public static TestResult[] values() {
        return (TestResult[]) $VALUES.clone();
    }

    public int getErrorCode() {
        int i10 = AnonymousClass1.$SwitchMap$com$google$android$ads$mediationtestsuite$dataobjects$TestResult[ordinal()];
        if (i10 != 3) {
            if (i10 != 4) {
                if (i10 != 5) {
                    return i10 != 6 ? -1 : 3;
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }

    public TestState getTestState() {
        return this.testState;
    }

    public String getText(Context context) {
        return context.getString(getTextResId());
    }

    public int getTextResId() {
        switch (AnonymousClass1.$SwitchMap$com$google$android$ads$mediationtestsuite$dataobjects$TestResult[ordinal()]) {
            case 1:
                return g.f20860h0;
            case 2:
                return g.G0;
            case 3:
                return g.f20881s;
            case 4:
                return g.f20883t;
            case 5:
                return g.f20889w;
            case 6:
                return k.d().f();
            case 7:
                return g.B0;
            default:
                return -1;
        }
    }

    public boolean isFailure() {
        return this.testState == TestState.f20944f;
    }
}
