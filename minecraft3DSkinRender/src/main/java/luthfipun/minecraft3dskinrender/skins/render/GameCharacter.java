package luthfipun.minecraft3dskinrender.skins.render;

import javax.microedition.khronos.opengles.GL10;

public class GameCharacter {
    public static int selected_resource;
    private boolean isAlexSkin;
    private boolean isRunning;
    private AlexLArm mAlexLArm;
    private AlexLArmOverlay mAlexLArmOverlay;
    private AlexRArm mAlexRArm;
    private AlexRArmOverlay mAlexRArmOverlay;
    private Body mBody;
    private BodyOverlay mBodyOverlay;
    private boolean mBodyOverlayVisible;
    private boolean mBodyVisible;
    private boolean mCheckAlexorSteave;
    private Hat mHat;
    private boolean mHatVisible;
    private Head mHead;
    private boolean mHeadVisible;
    private LArm mLArm;
    private LArmOverlay mLArmOverlay;
    private boolean mLArmOverlayVisible;
    private boolean mLArmVisible;
    private LLeg mLLeg;
    private LLegOverlay mLLegOverlay;
    private boolean mLLegOverlayVisible;
    private boolean mLLegVisible;
    private RArm mRArm;
    private RArmOverlay mRArmOverlay;
    private boolean mRArmOverlayVisible;
    private boolean mRArmVisible;
    private RLeg mRLeg;
    private RLegOverlay mRLegOverlay;
    private boolean mRLegOverlayVisible;
    private boolean mRLegVisible;
    private float[] mRotate;
    private float[] rotate_step;

    static {
        GameCharacter.selected_resource = 2131165201;
    }

    public GameCharacter() {
        this.isAlexSkin = false;
        this.isRunning = false;
        this.mBodyOverlayVisible = true;
        this.mBodyVisible = true;
        this.mHatVisible = true;
        this.mHeadVisible = true;
        this.mLArmOverlayVisible = true;
        this.mLArmVisible = true;
        this.mLLegOverlayVisible = true;
        this.mLLegVisible = true;
        this.mRArmOverlayVisible = true;
        this.mRArmVisible = true;
        this.mRLegOverlayVisible = true;
        this.mRLegVisible = true;
        this.mRotate = new float[]{0.0f, 0.0f, 0.0f};
        this.rotate_step = new float[]{5.0f, 5.0f, 5.0f};
        this.mHead = new Head();
        this.mHat = new Hat();
        this.mBody = new Body();
        this.mBodyOverlay = new BodyOverlay();
        this.mLArm = new LArm();
        this.mRArm = new RArm();
        this.mLArmOverlay = new LArmOverlay();
        this.mRArmOverlay = new RArmOverlay();
        this.mLLeg = new LLeg();
        this.mRLeg = new RLeg();
        this.mLLegOverlay = new LLegOverlay();
        this.mRLegOverlay = new RLegOverlay();
    }

    public GameCharacter(final int selected_resource) {
        this.isAlexSkin = false;
        this.isRunning = false;
        this.mBodyOverlayVisible = true;
        this.mBodyVisible = true;
        this.mHatVisible = true;
        this.mHeadVisible = true;
        this.mLArmOverlayVisible = true;
        this.mLArmVisible = true;
        this.mLLegOverlayVisible = true;
        this.mLLegVisible = true;
        this.mRArmOverlayVisible = true;
        this.mRArmVisible = true;
        this.mRLegOverlayVisible = true;
        this.mRLegVisible = true;
        this.mRotate = new float[]{0.0f, 0.0f, 0.0f};
        this.rotate_step = new float[]{5.0f, 5.0f, 5.0f};
        GameCharacter.selected_resource = selected_resource;
        this.mHead = new Head();
        this.mHat = new Hat();
        this.mBody = new Body();
        this.mBodyOverlay = new BodyOverlay();
        this.mLArm = new LArm();
        this.mRArm = new RArm();
        this.mLArmOverlay = new LArmOverlay();
        this.mRArmOverlay = new RArmOverlay();
        this.mLLeg = new LLeg();
        this.mRLeg = new RLeg();
        this.mLLegOverlay = new LLegOverlay();
        this.mRLegOverlay = new RLegOverlay();
    }

    public GameCharacter(final boolean mCheckAlexorSteave) {
        this.isAlexSkin = false;
        this.isRunning = false;
        this.mBodyOverlayVisible = true;
        this.mBodyVisible = true;
        this.mHatVisible = true;
        this.mHeadVisible = true;
        this.mLArmOverlayVisible = true;
        this.mLArmVisible = true;
        this.mLLegOverlayVisible = true;
        this.mLLegVisible = true;
        this.mRArmOverlayVisible = true;
        this.mRArmVisible = true;
        this.mRLegOverlayVisible = true;
        this.mRLegVisible = true;
        this.mRotate = new float[]{0.0f, 0.0f, 0.0f};
        this.rotate_step = new float[]{5.0f, 5.0f, 5.0f};
        if (!(this.mCheckAlexorSteave = mCheckAlexorSteave)) {
            this.mHead = new Head();
            this.mHat = new Hat();
            this.mBody = new Body();
            this.mBodyOverlay = new BodyOverlay();
            this.mLArm = new LArm();
            this.mRArm = new RArm();
            this.mLArmOverlay = new LArmOverlay();
            this.mRArmOverlay = new RArmOverlay();
            this.mLLeg = new LLeg();
            this.mRLeg = new RLeg();
            this.mLLegOverlay = new LLegOverlay();
            this.mRLegOverlay = new RLegOverlay();
            return;
        }
        this.mHead = new Head();
        this.mHat = new Hat();
        this.mBody = new Body();
        this.mBodyOverlay = new BodyOverlay();
        this.mAlexLArm = new AlexLArm();
        this.mAlexRArm = new AlexRArm();
        this.mAlexLArmOverlay = new AlexLArmOverlay();
        this.mAlexRArmOverlay = new AlexRArmOverlay();
        this.mLLeg = new LLeg();
        this.mRLeg = new RLeg();
        this.mLLegOverlay = new LLegOverlay();
        this.mRLegOverlay = new RLegOverlay();
    }

    public GameCharacter(final boolean mCheckAlexorSteave, final int selected_resource) {
        this.isAlexSkin = false;
        this.isRunning = false;
        this.mBodyOverlayVisible = true;
        this.mBodyVisible = true;
        this.mHatVisible = true;
        this.mHeadVisible = true;
        this.mLArmOverlayVisible = true;
        this.mLArmVisible = true;
        this.mLLegOverlayVisible = true;
        this.mLLegVisible = true;
        this.mRArmOverlayVisible = true;
        this.mRArmVisible = true;
        this.mRLegOverlayVisible = true;
        this.mRLegVisible = true;
        this.mRotate = new float[]{0.0f, 0.0f, 0.0f};
        this.rotate_step = new float[]{5.0f, 5.0f, 5.0f};
        this.mCheckAlexorSteave = mCheckAlexorSteave;
        GameCharacter.selected_resource = selected_resource;
        if (!mCheckAlexorSteave) {
            this.mHead = new Head();
            this.mHat = new Hat();
            this.mBody = new Body();
            this.mBodyOverlay = new BodyOverlay();
            this.mLArm = new LArm();
            this.mRArm = new RArm();
            this.mLArmOverlay = new LArmOverlay();
            this.mRArmOverlay = new RArmOverlay();
            this.mLLeg = new LLeg();
            this.mRLeg = new RLeg();
            this.mLLegOverlay = new LLegOverlay();
            this.mRLegOverlay = new RLegOverlay();
            return;
        }
        this.mHead = new Head();
        this.mHat = new Hat();
        this.mBody = new Body();
        this.mBodyOverlay = new BodyOverlay();
        this.mAlexLArm = new AlexLArm();
        this.mAlexRArm = new AlexRArm();
        this.mAlexLArmOverlay = new AlexLArmOverlay();
        this.mAlexRArmOverlay = new AlexRArmOverlay();
        this.mLLeg = new LLeg();
        this.mRLeg = new RLeg();
        this.mLLegOverlay = new LLegOverlay();
        this.mRLegOverlay = new RLegOverlay();
    }

    public void ResetRunForBody() {
        if (!this.mCheckAlexorSteave) {
            this.mHead = new Head();
            this.mHat = new Hat();
            this.mBody = new Body();
            this.mBodyOverlay = new BodyOverlay();
            this.mLArm = new LArm();
            this.mRArm = new RArm();
            this.mLArmOverlay = new LArmOverlay();
            this.mRArmOverlay = new RArmOverlay();
            this.mLLeg = new LLeg();
            this.mRLeg = new RLeg();
            this.mLLegOverlay = new LLegOverlay();
            this.mRLegOverlay = new RLegOverlay();
            return;
        }
        this.mHead = new Head();
        this.mHat = new Hat();
        this.mBody = new Body();
        this.mBodyOverlay = new BodyOverlay();
        this.mAlexLArm = new AlexLArm();
        this.mAlexRArm = new AlexRArm();
        this.mAlexLArmOverlay = new AlexLArmOverlay();
        this.mAlexRArmOverlay = new AlexRArmOverlay();
        this.mLLeg = new LLeg();
        this.mRLeg = new RLeg();
        this.mLLegOverlay = new LLegOverlay();
        this.mRLegOverlay = new RLegOverlay();
    }

    public void SetRotate(final float n, final float n2, final float n3) {
        this.mRotate[0] = n;
        this.mRotate[1] = n2;
        this.mRotate[2] = n3;
    }

    public void SetRotateStep(final float n, final float n2) {
        if (Math.abs(n) >= 1.0f) {
            final float[] mRotate = this.mRotate;
            mRotate[1] += this.rotate_step[1] * Math.signum(n) * 2.0f;
        }
        if (Math.abs(n2) >= 1.0f) {
            final float[] mRotate2 = this.mRotate;
            mRotate2[0] += this.rotate_step[0] * Math.signum(n2) * 2.0f;
        }
    }

    public void SetRunning(final boolean isRunning) {
        this.isRunning = isRunning;
    }

    public void draw(final GL10 gl10) {
        gl10.glMatrixMode(5888);
        gl10.glRotatef(this.mRotate[0], 1.0f, 0.0f, 0.0f);
        gl10.glRotatef(this.mRotate[1], 0.0f, 1.0f, 0.0f);
        gl10.glRotatef(this.mRotate[2], 0.0f, 0.0f, 1.0f);
        if (this.mBodyVisible) {
            this.mBody.draw(gl10, this.isRunning);
        }
        if (this.mHeadVisible) {
            this.mHead.draw(gl10, this.isRunning);
        }
        if (this.mLLegVisible) {
            this.mLLeg.draw(gl10, this.isRunning);
        }
        if (this.mRLegVisible) {
            this.mRLeg.draw(gl10, this.isRunning);
        }
        if (this.mRArm != null) {
            if (this.mLArmVisible) {
                this.mLArm.draw(gl10, this.isRunning);
            }
            if (this.mRArmVisible) {
                this.mRArm.draw(gl10, this.isRunning);
            }
            if (this.mHatVisible) {
                this.mHat.draw(gl10, this.isRunning);
            }
            if (this.mLArmOverlayVisible) {
                this.mLArmOverlay.draw(gl10, this.isRunning);
            }
            if (this.mRArmOverlayVisible) {
                this.mRArmOverlay.draw(gl10, this.isRunning);
            }
        } else {
            if (this.mLArmVisible) {
                this.mAlexLArm.draw(gl10, this.isRunning);
            }
            if (this.mRArmVisible) {
                this.mAlexRArm.draw(gl10, this.isRunning);
            }
            if (this.mHatVisible) {
                this.mHat.draw(gl10, this.isRunning);
            }
            if (this.mLArmOverlayVisible) {
                this.mAlexLArmOverlay.draw(gl10, this.isRunning);
            }
            if (this.mRArmOverlayVisible) {
                this.mAlexRArmOverlay.draw(gl10, this.isRunning);
            }
        }
        if (this.mLLegOverlayVisible) {
            this.mLLegOverlay.draw(gl10, this.isRunning);
        }
        if (this.mRLegOverlayVisible) {
            this.mRLegOverlay.draw(gl10, this.isRunning);
        }
        if (this.mBodyOverlayVisible) {
            this.mBodyOverlay.draw(gl10, this.isRunning);
        }
    }

    public Boolean getRunning() {
        return this.isRunning;
    }

    public float getXRotation() {
        return this.mRotate[0];
    }

    public float getYRotation() {
        return this.mRotate[1];
    }

    public float getZRotation() {
        return this.mRotate[2];
    }

    public void hideBodyPart(final BodyPart bodyPart, final boolean b) {
        if (bodyPart == BodyPart.BODY) {
            this.mBodyVisible = b;
        }
        if (bodyPart == BodyPart.HAT) {
            this.mHatVisible = b;
        }
        if (bodyPart == BodyPart.HEAD) {
            this.mHeadVisible = b;
        }
        if (bodyPart == BodyPart.JACKET) {
            this.mBodyOverlayVisible = b;
        }
        if (bodyPart == BodyPart.LEFT_ARM) {
            this.mLArmVisible = b;
        }
        if (bodyPart == BodyPart.RIGHT_ARM) {
            this.mRArmVisible = b;
        }
        if (bodyPart == BodyPart.LEFT_LEG) {
            this.mLLegVisible = b;
        }
        if (bodyPart == BodyPart.RIGHT_LEG) {
            this.mRLegVisible = b;
        }
        if (bodyPart == BodyPart.LEFT_SLEEVE) {
            this.mLArmOverlayVisible = b;
        }
        if (bodyPart == BodyPart.RIGHT_SLEEVE) {
            this.mRArmOverlayVisible = b;
        }
        if (bodyPart == BodyPart.LEFT_LEG_OVERLAY) {
            this.mLLegOverlayVisible = b;
        }
        if (bodyPart == BodyPart.RIGHT_LEG_OVERLAY) {
            this.mRLegOverlayVisible = b;
        }
    }

    public void setXRotation(final int n) {
        this.mRotate[0] = n;
    }

    public void setYRotation(final int n) {
        this.mRotate[1] = n;
    }

    public void setZRotation(final int n) {
        this.mRotate[2] = n;
    }

    public void showAllBodyParts() {
        this.mHeadVisible = true;
        this.mHatVisible = true;
        this.mBodyVisible = true;
        this.mBodyOverlayVisible = true;
        this.mLArmVisible = true;
        this.mRArmVisible = true;
        this.mLArmOverlayVisible = true;
        this.mRArmOverlayVisible = true;
        this.mLLegVisible = true;
        this.mRLegVisible = true;
        this.mLLegOverlayVisible = true;
        this.mRLegOverlayVisible = true;
    }
}
