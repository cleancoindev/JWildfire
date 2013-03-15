package org.jwildfire.create.tina.swing;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JToggleButton;
import javax.swing.JTree;

import org.jwildfire.base.Prefs;
import org.jwildfire.create.tina.render.ProgressUpdater;
import org.jwildfire.swing.ErrorHandler;

public class TinaControllerParameter {
  public JInternalFrame pTinaFrame;
  public ErrorHandler pErrorHandler;
  public Prefs pPrefs;
  public JPanel pCenterPanel;
  public JWFNumberField pCameraRollREd;
  public JSlider pCameraRollSlider;
  public JWFNumberField pCameraPitchREd;
  public JSlider pCameraPitchSlider;
  public JWFNumberField pCameraYawREd;
  public JSlider pCameraYawSlider;
  public JWFNumberField pCameraPerspectiveREd;
  public JSlider pCameraPerspectiveSlider;
  public JWFNumberField pCameraCentreXREd;
  public JSlider pCameraCentreXSlider;
  public JWFNumberField pCameraCentreYREd;
  public JSlider pCameraCentreYSlider;
  public JWFNumberField pCameraZoomREd;
  public JSlider pCameraZoomSlider;
  public JCheckBox pNewDOFCBx;
  public JWFNumberField pFocusXREd;
  public JSlider pFocusXSlider;
  public JWFNumberField pFocusYREd;
  public JSlider pFocusYSlider;
  public JWFNumberField pFocusZREd;
  public JSlider pFocusZSlider;
  public JWFNumberField pDimishZREd;
  public JSlider pDimishZSlider;
  public JWFNumberField pCameraDOFREd;
  public JSlider pCameraDOFSlider;
  public JWFNumberField pCameraDOFAreaREd;
  public JSlider pCameraDOFAreaSlider;
  public JWFNumberField pCameraDOFExponentREd;
  public JSlider pCameraDOFExponentSlider;
  public JWFNumberField pCamZREd;
  public JSlider pCamZSlider;
  public JWFNumberField pPixelsPerUnitREd;
  public JSlider pPixelsPerUnitSlider;
  public JWFNumberField pBrightnessREd;
  public JSlider pBrightnessSlider;
  public JWFNumberField pContrastREd;
  public JSlider pContrastSlider;
  public JWFNumberField pGammaREd;
  public JSlider pGammaSlider;
  public JWFNumberField pVibrancyREd;
  public JSlider pVibrancySlider;
  public JWFNumberField pFilterRadiusREd;
  public JSlider pFilterRadiusSlider;
  public JComboBox pFilterKernelCmb;
  public JCheckBox pDEFilterEnableCbx;
  public JWFNumberField pDEFilterMaxRadiusREd;
  public JSlider pDEFilterMaxRadiusSlider;
  public JWFNumberField pDEFilterMinRadiusREd;
  public JSlider pDEFilterMinRadiusSlider;
  public JWFNumberField pDEFilterCurveREd;
  public JSlider pDEFilterCurveSlider;
  public JComboBox pDEFilterKernelCmb;
  public JWFNumberField pGammaThresholdREd;
  public JSlider pGammaThresholdSlider;
  public JCheckBox pBGTransparencyCBx;
  public JWFNumberField pBGColorRedREd;
  public JSlider pBGColorRedSlider;
  public JWFNumberField pBGColorGreenREd;
  public JSlider pBGColorGreenSlider;
  public JWFNumberField pBGColorBlueREd;
  public JSlider pBGColorBlueSlider;
  public JTextField pPaletteRandomPointsREd;
  public JPanel pPaletteImgPanel;
  public JPanel pColorChooserPaletteImgPanel;
  public JWFNumberField pPaletteShiftREd;
  public JSlider pPaletteShiftSlider;
  public JWFNumberField pPaletteRedREd;
  public JSlider pPaletteRedSlider;
  public JWFNumberField pPaletteGreenREd;
  public JSlider pPaletteGreenSlider;
  public JWFNumberField pPaletteBlueREd;
  public JSlider pPaletteBlueSlider;
  public JWFNumberField pPaletteHueREd;
  public JSlider pPaletteHueSlider;
  public JWFNumberField pPaletteSaturationREd;
  public JSlider pPaletteSaturationSlider;
  public JWFNumberField pPaletteContrastREd;
  public JSlider pPaletteContrastSlider;
  public JWFNumberField pPaletteGammaREd;
  public JSlider pPaletteGammaSlider;
  public JWFNumberField pPaletteBrightnessREd;
  public JSlider pPaletteBrightnessSlider;
  public JWFNumberField pPaletteSwapRGBREd;
  public JSlider pPaletteSwapRGBSlider;
  public JWFNumberField pPaletteFrequencyREd;
  public JSlider pPaletteFrequencySlider;
  public JWFNumberField pPaletteBlurREd;
  public JSlider pPaletteBlurSlider;
  public JButton pPaletteInvertBtn;
  public JButton pPaletteReverseBtn;
  public JTable pTransformationsTable;
  public JWFNumberField pAffineC00REd;
  public JWFNumberField pAffineC01REd;
  public JWFNumberField pAffineC10REd;
  public JWFNumberField pAffineC11REd;
  public JWFNumberField pAffineC20REd;
  public JWFNumberField pAffineC21REd;
  public JTextField pAffineRotateAmountREd;
  public JTextField pAffineScaleAmountREd;
  public JTextField pAffineMoveAmountREd;
  public JButton pAffineRotateLeftButton;
  public JButton pAffineRotateRightButton;
  public JButton pAffineEnlargeButton;
  public JButton pAffineShrinkButton;
  public JButton pAffineMoveUpButton;
  public JButton pAffineMoveLeftButton;
  public JButton pAffineMoveRightButton;
  public JButton pAffineMoveDownButton;
  public JButton pAddTransformationButton;
  public JButton pAddLinkedTransformationButton;
  public JButton pDuplicateTransformationButton;
  public JButton pDeleteTransformationButton;
  public JButton pAddFinalTransformationButton;
  public JPanel pRandomBatchPanel;
  public TinaNonlinearControlsRow[] pTinaNonlinearControlsRows;
  public JWFNumberField pXFormColorREd;
  public JSlider pXFormColorSlider;
  public JWFNumberField pXFormSymmetryREd;
  public JSlider pXFormSymmetrySlider;
  public JWFNumberField pXFormOpacityREd;
  public JSlider pXFormOpacitySlider;
  public JComboBox pXFormDrawModeCmb;
  public JTable pRelWeightsTable;
  public JButton pRelWeightsZeroButton;
  public JButton pRelWeightsOneButton;
  public JWFNumberField pRelWeightREd;
  public JToggleButton pMouseTransformMoveButton;
  public JToggleButton pMouseTransformScaleButton;
  public JToggleButton pMouseTransformShearButton;
  public JToggleButton pMouseTransformViewButton;
  public JToggleButton pAffineEditPostTransformButton;
  public JToggleButton pAffineEditPostTransformSmallButton;
  public JButton pMouseEditZoomInButton;
  public JButton pMouseEditZoomOutButton;
  public ProgressUpdater pMainProgressUpdater;
  public JButton pAffineResetTransformButton;
  public JTable pCreatePaletteColorsTable;
  public JComboBox pShadingCmb;
  public JWFNumberField pShadingAmbientREd;
  public JSlider pShadingAmbientSlider;
  public JWFNumberField pShadingDiffuseREd;
  public JSlider pShadingDiffuseSlider;
  public JWFNumberField pShadingPhongREd;
  public JSlider pShadingPhongSlider;
  public JWFNumberField pShadingPhongSizeREd;
  public JSlider pShadingPhongSizeSlider;
  public JComboBox pShadingLightCmb;
  public JWFNumberField pShadingLightXREd;
  public JSlider pShadingLightXSlider;
  public JWFNumberField pShadingLightYREd;
  public JSlider pShadingLightYSlider;
  public JWFNumberField pShadingLightZREd;
  public JSlider pShadingLightZSlider;
  public JWFNumberField pShadingLightRedREd;
  public JSlider pShadingLightRedSlider;
  public JWFNumberField pShadingLightGreenREd;
  public JSlider pShadingLightGreenSlider;
  public JWFNumberField pShadingLightBlueREd;
  public JSlider pShadingLightBlueSlider;
  public JWFNumberField pShadingDistanceColorRadiusREd;
  public JSlider pShadingDistanceColorRadiusSlider;
  public JWFNumberField pShadingDistanceColorScaleREd;
  public JSlider pShadingDistanceColorScaleSlider;
  public JWFNumberField pShadingDistanceColorExponentREd;
  public JSlider pShadingDistanceColorExponentSlider;
  public JWFNumberField pShadingDistanceColorOffsetXREd;
  public JSlider pShadingDistanceColorOffsetXSlider;
  public JWFNumberField pShadingDistanceColorOffsetYREd;
  public JSlider pShadingDistanceColorOffsetYSlider;
  public JWFNumberField pShadingDistanceColorOffsetZREd;
  public JSlider pShadingDistanceColorOffsetZSlider;
  public JWFNumberField pShadingDistanceColorStyleREd;
  public JSlider pShadingDistanceColorStyleSlider;
  public JWFNumberField pShadingDistanceColorCoordinateREd;
  public JSlider pShadingDistanceColorCoordinateSlider;
  public JWFNumberField pShadingDistanceColorShiftREd;
  public JSlider pShadingDistanceColorShiftSlider;
  public JToggleButton pMouseTransformSlowButton;
  public JTable pRenderBatchJobsTable;
  public JPanel pBatchPreviewRootPanel;
  public JProgressBar pBatchRenderJobProgressBar;
  public JProgressBar pBatchRenderTotalProgressBar;
  public ProgressUpdater pJobProgressUpdater;
  public JButton pBatchRenderAddFilesButton;
  public JButton pBatchRenderFilesMoveDownButton;
  public JButton pBatchRenderFilesMoveUpButton;
  public JButton pBatchRenderFilesRemoveButton;
  public JButton pBatchRenderFilesRemoveAllButton;
  public JButton pBatchRenderStartButton;
  public JTabbedPane pRootTabbedPane;
  public JButton pAffineFlipHorizontalButton;
  public JButton pAffineFlipVerticalButton;
  public JToggleButton pToggleDarkTrianglesButton;
  public JWFNumberField pShadingBlurRadiusREd;
  public JSlider pShadingBlurRadiusSlider;
  public JWFNumberField pShadingBlurFadeREd;
  public JSlider pShadingBlurFadeSlider;
  public JWFNumberField pShadingBlurFallOffREd;
  public JSlider pShadingBlurFallOffSlider;
  public JTextArea pScriptTextArea;
  public JToggleButton pAffineScaleXButton;
  public JToggleButton pAffineScaleYButton;
  public JPanel pGradientLibraryPanel;
  public JComboBox pGradientLibraryGradientCmb;
  public JTextPane pHelpPane;
  public JTextPane pFAQPane;
  public JToggleButton pToggleVariationsButton;
  public JToggleButton pToggleTransparencyButton;
  public JToggleButton pAffinePreserveZButton;
  public JComboBox pQualityProfileCmb;
  public JComboBox pResolutionProfileCmb;
  public JComboBox pBatchQualityProfileCmb;
  public JComboBox pBatchResolutionProfileCmb;
  public JComboBox pInteractiveQualityProfileCmb;
  public JComboBox pInteractiveResolutionProfileCmb;
  public JComboBox pSWFAnimatorQualityProfileCmb;
  public JComboBox pSWFAnimatorResolutionProfileCmb;
  public JButton pRenderFlameButton;
  public JButton pRenderMainButton;
  public JButton pAppendToMovieButton;
  public JWFNumberField pTransformationWeightREd;
  public JButton pUndoButton;
  public JButton pRedoButton;
  public JWFNumberField pXFormAntialiasAmountREd;
  public JSlider pXFormAntialiasAmountSlider;
  public JWFNumberField pXFormAntialiasRadiusREd;
  public JSlider pXFormAntialiasRadiusSlider;
  public JButton pXFormAntialiasCopyToAllBtn;
  public JPanel pDancingFlamesFlamePnl;
  public JPanel pDancingFlamesGraph1Pnl;
  public JButton pDancingFlamesLoadSoundBtn;
  public JButton pDancingFlamesAddFromClipboardBtn;
  public JButton pDancingFlamesAddFromEditorBtn;
  public JButton pDancingFlamesAddFromDiscBtn;
  public JWFNumberField pDancingFlamesRandomCountIEd;
  public JButton pDancingFlamesGenRandFlamesBtn;
  public JComboBox pDancingFlamesRandomGenCmb;
  public JPanel pDancingFlamesPoolFlamePreviewPnl;
  public JSlider pDancingFlamesBorderSizeSlider;
  public JButton pDancingFlamesFlameToEditorBtn;
  public JButton pDancingFlamesDeleteFlameBtn;
  public JTextField pDancingFlamesFramesPerSecondIEd;
  public JTextField pDancingFlamesMorphFrameCountIEd;
  public JButton pDancingFlamesStartShowButton;
  public JButton pDancingFlamesStopShowButton;
  public JCheckBox pDancingFlamesDoRecordCBx;
  public JComboBox pDancingFlamesFlamesCmb;
  public JCheckBox pDancingFlamesDrawTrianglesCBx;
  public JCheckBox pDancingFlamesDrawFFTCBx;
  public JCheckBox pDancingFlamesDrawFPSCBx;
  public JTree pDancingFlamesFlamePropertiesTree;
  public JPanel pDancingFlamesMotionPropertyPnl;
  public JTable pDancingFlamesMotionTable;
  public JComboBox pDancingFlamesAddMotionCmb;
  public JButton pDancingFlamesAddMotionBtn;
  public JButton pDancingFlamesDeleteMotionBtn;
  public JButton pDancingFlamesLinkMotionBtn;
  public JButton pDancingFlamesUnlinkMotionBtn;
  public JComboBox pDancingFlamesCreateMotionsCmb;
  public JButton pDancingFlamesClearMotionsBtn;
  public JButton pDancingFlamesLoadProjectBtn;
  public JButton pDancingFlamesSaveProjectBtn;
  public JTable pDancingFlamesMotionLinksTable;
  public JPanel mutaGen01Pnl;
  public JPanel mutaGen02Pnl;
  public JPanel mutaGen03Pnl;
  public JPanel mutaGen04Pnl;
  public JPanel mutaGen05Pnl;
  public JPanel mutaGen06Pnl;
  public JPanel mutaGen07Pnl;
  public JPanel mutaGen08Pnl;
  public JPanel mutaGen09Pnl;
  public JPanel mutaGen10Pnl;
  public JPanel mutaGen11Pnl;
  public JPanel mutaGen12Pnl;
  public JPanel mutaGen13Pnl;
  public JPanel mutaGen14Pnl;
  public JPanel mutaGen15Pnl;
  public JPanel mutaGen16Pnl;
  public JPanel mutaGen17Pnl;
  public JPanel mutaGen18Pnl;
  public JPanel mutaGen19Pnl;
  public JPanel mutaGen20Pnl;
  public JPanel mutaGen21Pnl;
  public JPanel mutaGen22Pnl;
  public JPanel mutaGen23Pnl;
  public JPanel mutaGen24Pnl;
  public JPanel mutaGen25Pnl;

  public void setParams1(JInternalFrame pTinaFrame, ErrorHandler pErrorHandler, Prefs pPrefs, JPanel pCenterPanel, JWFNumberField pCameraRollREd, JSlider pCameraRollSlider, JWFNumberField pCameraPitchREd, JSlider pCameraPitchSlider, JWFNumberField pCameraYawREd, JSlider pCameraYawSlider, JWFNumberField pCameraPerspectiveREd, JSlider pCameraPerspectiveSlider, JWFNumberField pCameraCentreXREd, JSlider pCameraCentreXSlider, JWFNumberField pCameraCentreYREd, JSlider pCameraCentreYSlider, JWFNumberField pCameraZoomREd, JSlider pCameraZoomSlider, JCheckBox pNewDOFCBx, JWFNumberField pFocusXREd, JSlider pFocusXSlider, JWFNumberField pFocusYREd, JSlider pFocusYSlider, JWFNumberField pFocusZREd, JSlider pFocusZSlider, JWFNumberField pDimishZREd, JSlider pDimishZSlider,
      JWFNumberField pCameraDOFREd, JSlider pCameraDOFSlider, JWFNumberField pCameraDOFAreaREd, JSlider pCameraDOFAreaSlider, JWFNumberField pCameraDOFExponentREd, JSlider pCameraDOFExponentSlider, JWFNumberField pCamZREd, JSlider pCamZSlider, JWFNumberField pPixelsPerUnitREd, JSlider pPixelsPerUnitSlider, JWFNumberField pBrightnessREd, JSlider pBrightnessSlider, JWFNumberField pContrastREd, JSlider pContrastSlider, JWFNumberField pGammaREd, JSlider pGammaSlider, JWFNumberField pVibrancyREd, JSlider pVibrancySlider, JWFNumberField pFilterRadiusREd, JSlider pFilterRadiusSlider, JComboBox pFilterKernelCmb, JCheckBox pDEFilterEnableCbx, JWFNumberField pDEFilterMaxRadiusREd, JSlider pDEFilterMaxRadiusSlider, JWFNumberField pDEFilterMinRadiusREd, JSlider pDEFilterMinRadiusSlider,
      JWFNumberField pDEFilterCurveREd, JSlider pDEFilterCurveSlider, JComboBox pDEFilterKernelCmb, JWFNumberField pGammaThresholdREd, JSlider pGammaThresholdSlider, JCheckBox pBGTransparencyCBx, JWFNumberField pBGColorRedREd, JSlider pBGColorRedSlider, JWFNumberField pBGColorGreenREd, JSlider pBGColorGreenSlider, JWFNumberField pBGColorBlueREd, JSlider pBGColorBlueSlider, JTextField pPaletteRandomPointsREd, JPanel pPaletteImgPanel, JPanel pColorChooserPaletteImgPanel, JWFNumberField pPaletteShiftREd, JSlider pPaletteShiftSlider, JWFNumberField pPaletteRedREd, JSlider pPaletteRedSlider, JWFNumberField pPaletteGreenREd, JSlider pPaletteGreenSlider, JWFNumberField pPaletteBlueREd, JSlider pPaletteBlueSlider, JWFNumberField pPaletteHueREd, JSlider pPaletteHueSlider,
      JWFNumberField pPaletteSaturationREd, JSlider pPaletteSaturationSlider, JWFNumberField pPaletteContrastREd, JSlider pPaletteContrastSlider, JWFNumberField pPaletteGammaREd, JSlider pPaletteGammaSlider, JWFNumberField pPaletteBrightnessREd, JSlider pPaletteBrightnessSlider, JWFNumberField pPaletteSwapRGBREd, JSlider pPaletteSwapRGBSlider, JWFNumberField pPaletteFrequencyREd, JSlider pPaletteFrequencySlider, JWFNumberField pPaletteBlurREd, JSlider pPaletteBlurSlider, JButton pPaletteInvertBtn, JButton pPaletteReverseBtn, JTable pTransformationsTable, JWFNumberField pAffineC00REd, JWFNumberField pAffineC01REd, JWFNumberField pAffineC10REd, JWFNumberField pAffineC11REd, JWFNumberField pAffineC20REd, JWFNumberField pAffineC21REd, JTextField pAffineRotateAmountREd,
      JTextField pAffineScaleAmountREd, JTextField pAffineMoveAmountREd, JButton pAffineRotateLeftButton, JButton pAffineRotateRightButton, JButton pAffineEnlargeButton, JButton pAffineShrinkButton, JButton pAffineMoveUpButton, JButton pAffineMoveLeftButton, JButton pAffineMoveRightButton, JButton pAffineMoveDownButton, JButton pAddTransformationButton, JButton pAddLinkedTransformationButton, JButton pDuplicateTransformationButton, JButton pDeleteTransformationButton, JButton pAddFinalTransformationButton, JPanel pRandomBatchPanel, TinaNonlinearControlsRow[] pTinaNonlinearControlsRows, JWFNumberField pXFormColorREd, JSlider pXFormColorSlider, JWFNumberField pXFormSymmetryREd, JSlider pXFormSymmetrySlider, JWFNumberField pXFormOpacityREd, JSlider pXFormOpacitySlider,
      JComboBox pXFormDrawModeCmb, JTable pRelWeightsTable, JButton pRelWeightsZeroButton, JButton pRelWeightsOneButton, JWFNumberField pRelWeightREd, JToggleButton pMouseTransformMoveButton, JToggleButton pMouseTransformScaleButton, JToggleButton pMouseTransformShearButton, JToggleButton pMouseTransformViewButton, JToggleButton pAffineEditPostTransformButton, JToggleButton pAffineEditPostTransformSmallButton, JButton pMouseEditZoomInButton, JButton pMouseEditZoomOutButton, ProgressUpdater pMainProgressUpdater, JButton pAffineResetTransformButton, JTable pCreatePaletteColorsTable, JComboBox pShadingCmb, JWFNumberField pShadingAmbientREd, JSlider pShadingAmbientSlider, JWFNumberField pShadingDiffuseREd, JSlider pShadingDiffuseSlider, JWFNumberField pShadingPhongREd,
      JSlider pShadingPhongSlider, JWFNumberField pShadingPhongSizeREd, JSlider pShadingPhongSizeSlider, JComboBox pShadingLightCmb, JWFNumberField pShadingLightXREd, JSlider pShadingLightXSlider, JWFNumberField pShadingLightYREd, JSlider pShadingLightYSlider, JWFNumberField pShadingLightZREd, JSlider pShadingLightZSlider, JWFNumberField pShadingLightRedREd, JSlider pShadingLightRedSlider, JWFNumberField pShadingLightGreenREd, JSlider pShadingLightGreenSlider, JWFNumberField pShadingLightBlueREd, JSlider pShadingLightBlueSlider, JWFNumberField pShadingDistanceColorRadiusREd, JSlider pShadingDistanceColorRadiusSlider, JWFNumberField pShadingDistanceColorScaleREd, JSlider pShadingDistanceColorScaleSlider, JWFNumberField pShadingDistanceColorExponentREd,
      JSlider pShadingDistanceColorExponentSlider, JWFNumberField pShadingDistanceColorOffsetXREd, JSlider pShadingDistanceColorOffsetXSlider, JWFNumberField pShadingDistanceColorOffsetYREd, JSlider pShadingDistanceColorOffsetYSlider, JWFNumberField pShadingDistanceColorOffsetZREd, JSlider pShadingDistanceColorOffsetZSlider, JToggleButton pMouseTransformSlowButton, JTable pRenderBatchJobsTable, JPanel pBatchPreviewRootPanel, JProgressBar pBatchRenderJobProgressBar, JProgressBar pBatchRenderTotalProgressBar, ProgressUpdater pJobProgressUpdater, JButton pBatchRenderAddFilesButton, JButton pBatchRenderFilesMoveDownButton, JButton pBatchRenderFilesMoveUpButton, JButton pBatchRenderFilesRemoveButton, JButton pBatchRenderFilesRemoveAllButton, JButton pBatchRenderStartButton,
      JTabbedPane pRootTabbedPane, JButton pAffineFlipHorizontalButton, JButton pAffineFlipVerticalButton, JToggleButton pToggleDarkTrianglesButton, JWFNumberField pShadingBlurRadiusREd, JSlider pShadingBlurRadiusSlider, JWFNumberField pShadingBlurFadeREd, JSlider pShadingBlurFadeSlider, JWFNumberField pShadingBlurFallOffREd, JSlider pShadingBlurFallOffSlider, JTextArea pScriptTextArea, JToggleButton pAffineScaleXButton, JToggleButton pAffineScaleYButton, JPanel pGradientLibraryPanel, JComboBox pGradientLibraryGradientCmb, JTextPane pHelpPane, JTextPane pFAQPane, JToggleButton pToggleVariationsButton, JToggleButton pToggleTransparencyButton, JToggleButton pAffinePreserveZButton, JComboBox pQualityProfileCmb, JComboBox pResolutionProfileCmb, JComboBox pBatchQualityProfileCmb,
      JComboBox pBatchResolutionProfileCmb, JComboBox pInteractiveQualityProfileCmb, JComboBox pInteractiveResolutionProfileCmb, JComboBox pSWFAnimatorQualityProfileCmb, JComboBox pSWFAnimatorResolutionProfileCmb, JButton pRenderFlameButton, JButton pRenderMainButton, JButton pAppendToMovieButton, JWFNumberField pTransformationWeightREd, JButton pUndoButton, JButton pRedoButton, JWFNumberField pXFormAntialiasAmountREd, JSlider pXFormAntialiasAmountSlider, JWFNumberField pXFormAntialiasRadiusREd, JSlider pXFormAntialiasRadiusSlider, JButton pXFormAntialiasCopyToAllBtn, JPanel pDancingFlamesFlamePnl, JPanel pDancingFlamesGraph1Pnl, JButton pDancingFlamesLoadSoundBtn, JButton pDancingFlamesAddFromClipboardBtn, JButton pDancingFlamesAddFromEditorBtn, JButton pDancingFlamesAddFromDiscBtn,
      JWFNumberField pDancingFlamesRandomCountIEd, JButton pDancingFlamesGenRandFlamesBtn, JComboBox pDancingFlamesRandomGenCmb, JPanel pDancingFlamesPoolFlamePreviewPnl, JSlider pDancingFlamesBorderSizeSlider, JButton pDancingFlamesFlameToEditorBtn, JButton pDancingFlamesDeleteFlameBtn, JTextField pDancingFlamesFramesPerSecondIEd, JTextField pDancingFlamesMorphFrameCountIEd, JButton pDancingFlamesStartShowButton, JButton pDancingFlamesStopShowButton, JCheckBox pDancingFlamesDoRecordCBx, JComboBox pDancingFlamesFlamesCmb, JCheckBox pDancingFlamesDrawTrianglesCBx, JCheckBox pDancingFlamesDrawFFTCBx, JCheckBox pDancingFlamesDrawFPSCBx, JTree pDancingFlamesFlamePropertiesTree, JPanel pDancingFlamesMotionPropertyPnl, JTable pDancingFlamesMotionTable, JComboBox pDancingFlamesAddMotionCmb,
      JButton pDancingFlamesAddMotionBtn, JButton pDancingFlamesDeleteMotionBtn) {
    this.pTinaFrame = pTinaFrame;
    this.pErrorHandler = pErrorHandler;
    this.pPrefs = pPrefs;
    this.pCenterPanel = pCenterPanel;
    this.pCameraRollREd = pCameraRollREd;
    this.pCameraRollSlider = pCameraRollSlider;
    this.pCameraPitchREd = pCameraPitchREd;
    this.pCameraPitchSlider = pCameraPitchSlider;
    this.pCameraYawREd = pCameraYawREd;
    this.pCameraYawSlider = pCameraYawSlider;
    this.pCameraPerspectiveREd = pCameraPerspectiveREd;
    this.pCameraPerspectiveSlider = pCameraPerspectiveSlider;
    this.pCameraCentreXREd = pCameraCentreXREd;
    this.pCameraCentreXSlider = pCameraCentreXSlider;
    this.pCameraCentreYREd = pCameraCentreYREd;
    this.pCameraCentreYSlider = pCameraCentreYSlider;
    this.pCameraZoomREd = pCameraZoomREd;
    this.pCameraZoomSlider = pCameraZoomSlider;
    this.pNewDOFCBx = pNewDOFCBx;
    this.pFocusXREd = pFocusXREd;
    this.pFocusXSlider = pFocusXSlider;
    this.pFocusYREd = pFocusYREd;
    this.pFocusYSlider = pFocusYSlider;
    this.pFocusZREd = pFocusZREd;
    this.pFocusZSlider = pFocusZSlider;
    this.pDimishZREd = pDimishZREd;
    this.pDimishZSlider = pDimishZSlider;
    this.pCameraDOFREd = pCameraDOFREd;
    this.pCameraDOFSlider = pCameraDOFSlider;
    this.pCameraDOFAreaREd = pCameraDOFAreaREd;
    this.pCameraDOFAreaSlider = pCameraDOFAreaSlider;
    this.pCameraDOFExponentREd = pCameraDOFExponentREd;
    this.pCameraDOFExponentSlider = pCameraDOFExponentSlider;
    this.pCamZREd = pCamZREd;
    this.pCamZSlider = pCamZSlider;
    this.pPixelsPerUnitREd = pPixelsPerUnitREd;
    this.pPixelsPerUnitSlider = pPixelsPerUnitSlider;
    this.pBrightnessREd = pBrightnessREd;
    this.pBrightnessSlider = pBrightnessSlider;
    this.pContrastREd = pContrastREd;
    this.pContrastSlider = pContrastSlider;
    this.pGammaREd = pGammaREd;
    this.pGammaSlider = pGammaSlider;
    this.pVibrancyREd = pVibrancyREd;
    this.pVibrancySlider = pVibrancySlider;
    this.pFilterRadiusREd = pFilterRadiusREd;
    this.pFilterRadiusSlider = pFilterRadiusSlider;
    this.pFilterKernelCmb = pFilterKernelCmb;
    this.pDEFilterEnableCbx = pDEFilterEnableCbx;
    this.pDEFilterMaxRadiusREd = pDEFilterMaxRadiusREd;
    this.pDEFilterMaxRadiusSlider = pDEFilterMaxRadiusSlider;
    this.pDEFilterMinRadiusREd = pDEFilterMinRadiusREd;
    this.pDEFilterMinRadiusSlider = pDEFilterMinRadiusSlider;
    this.pDEFilterCurveREd = pDEFilterCurveREd;
    this.pDEFilterCurveSlider = pDEFilterCurveSlider;
    this.pDEFilterKernelCmb = pDEFilterKernelCmb;
    this.pGammaThresholdREd = pGammaThresholdREd;
    this.pGammaThresholdSlider = pGammaThresholdSlider;
    this.pBGTransparencyCBx = pBGTransparencyCBx;
    this.pBGColorRedREd = pBGColorRedREd;
    this.pBGColorRedSlider = pBGColorRedSlider;
    this.pBGColorGreenREd = pBGColorGreenREd;
    this.pBGColorGreenSlider = pBGColorGreenSlider;
    this.pBGColorBlueREd = pBGColorBlueREd;
    this.pBGColorBlueSlider = pBGColorBlueSlider;
    this.pPaletteRandomPointsREd = pPaletteRandomPointsREd;
    this.pPaletteImgPanel = pPaletteImgPanel;
    this.pColorChooserPaletteImgPanel = pColorChooserPaletteImgPanel;
    this.pPaletteShiftREd = pPaletteShiftREd;
    this.pPaletteShiftSlider = pPaletteShiftSlider;
    this.pPaletteRedREd = pPaletteRedREd;
    this.pPaletteRedSlider = pPaletteRedSlider;
    this.pPaletteGreenREd = pPaletteGreenREd;
    this.pPaletteGreenSlider = pPaletteGreenSlider;
    this.pPaletteBlueREd = pPaletteBlueREd;
    this.pPaletteBlueSlider = pPaletteBlueSlider;
    this.pPaletteHueREd = pPaletteHueREd;
    this.pPaletteHueSlider = pPaletteHueSlider;
    this.pPaletteSaturationREd = pPaletteSaturationREd;
    this.pPaletteSaturationSlider = pPaletteSaturationSlider;
    this.pPaletteContrastREd = pPaletteContrastREd;
    this.pPaletteContrastSlider = pPaletteContrastSlider;
    this.pPaletteGammaREd = pPaletteGammaREd;
    this.pPaletteGammaSlider = pPaletteGammaSlider;
    this.pPaletteBrightnessREd = pPaletteBrightnessREd;
    this.pPaletteBrightnessSlider = pPaletteBrightnessSlider;
    this.pPaletteSwapRGBREd = pPaletteSwapRGBREd;
    this.pPaletteSwapRGBSlider = pPaletteSwapRGBSlider;
    this.pPaletteFrequencyREd = pPaletteFrequencyREd;
    this.pPaletteFrequencySlider = pPaletteFrequencySlider;
    this.pPaletteBlurREd = pPaletteBlurREd;
    this.pPaletteBlurSlider = pPaletteBlurSlider;
    this.pPaletteInvertBtn = pPaletteInvertBtn;
    this.pPaletteReverseBtn = pPaletteReverseBtn;
    this.pTransformationsTable = pTransformationsTable;
    this.pAffineC00REd = pAffineC00REd;
    this.pAffineC01REd = pAffineC01REd;
    this.pAffineC10REd = pAffineC10REd;
    this.pAffineC11REd = pAffineC11REd;
    this.pAffineC20REd = pAffineC20REd;
    this.pAffineC21REd = pAffineC21REd;
    this.pAffineRotateAmountREd = pAffineRotateAmountREd;
    this.pAffineScaleAmountREd = pAffineScaleAmountREd;
    this.pAffineMoveAmountREd = pAffineMoveAmountREd;
    this.pAffineRotateLeftButton = pAffineRotateLeftButton;
    this.pAffineRotateRightButton = pAffineRotateRightButton;
    this.pAffineEnlargeButton = pAffineEnlargeButton;
    this.pAffineShrinkButton = pAffineShrinkButton;
    this.pAffineMoveUpButton = pAffineMoveUpButton;
    this.pAffineMoveLeftButton = pAffineMoveLeftButton;
    this.pAffineMoveRightButton = pAffineMoveRightButton;
    this.pAffineMoveDownButton = pAffineMoveDownButton;
    this.pAddTransformationButton = pAddTransformationButton;
    this.pAddLinkedTransformationButton = pAddLinkedTransformationButton;
    this.pDuplicateTransformationButton = pDuplicateTransformationButton;
    this.pDeleteTransformationButton = pDeleteTransformationButton;
    this.pAddFinalTransformationButton = pAddFinalTransformationButton;
    this.pRandomBatchPanel = pRandomBatchPanel;
    this.pTinaNonlinearControlsRows = pTinaNonlinearControlsRows;
    this.pXFormColorREd = pXFormColorREd;
    this.pXFormColorSlider = pXFormColorSlider;
    this.pXFormSymmetryREd = pXFormSymmetryREd;
    this.pXFormSymmetrySlider = pXFormSymmetrySlider;
    this.pXFormOpacityREd = pXFormOpacityREd;
    this.pXFormOpacitySlider = pXFormOpacitySlider;
    this.pXFormDrawModeCmb = pXFormDrawModeCmb;
    this.pRelWeightsTable = pRelWeightsTable;
    this.pRelWeightsZeroButton = pRelWeightsZeroButton;
    this.pRelWeightsOneButton = pRelWeightsOneButton;
    this.pRelWeightREd = pRelWeightREd;
    this.pMouseTransformMoveButton = pMouseTransformMoveButton;
    this.pMouseTransformScaleButton = pMouseTransformScaleButton;
    this.pMouseTransformShearButton = pMouseTransformShearButton;
    this.pMouseTransformViewButton = pMouseTransformViewButton;
    this.pAffineEditPostTransformButton = pAffineEditPostTransformButton;
    this.pAffineEditPostTransformSmallButton = pAffineEditPostTransformSmallButton;
    this.pMouseEditZoomInButton = pMouseEditZoomInButton;
    this.pMouseEditZoomOutButton = pMouseEditZoomOutButton;
    this.pMainProgressUpdater = pMainProgressUpdater;
    this.pAffineResetTransformButton = pAffineResetTransformButton;
    this.pCreatePaletteColorsTable = pCreatePaletteColorsTable;
    this.pShadingCmb = pShadingCmb;
    this.pShadingAmbientREd = pShadingAmbientREd;
    this.pShadingAmbientSlider = pShadingAmbientSlider;
    this.pShadingDiffuseREd = pShadingDiffuseREd;
    this.pShadingDiffuseSlider = pShadingDiffuseSlider;
    this.pShadingPhongREd = pShadingPhongREd;
    this.pShadingPhongSlider = pShadingPhongSlider;
    this.pShadingPhongSizeREd = pShadingPhongSizeREd;
    this.pShadingPhongSizeSlider = pShadingPhongSizeSlider;
    this.pShadingLightCmb = pShadingLightCmb;
    this.pShadingLightXREd = pShadingLightXREd;
    this.pShadingLightXSlider = pShadingLightXSlider;
    this.pShadingLightYREd = pShadingLightYREd;
    this.pShadingLightYSlider = pShadingLightYSlider;
    this.pShadingLightZREd = pShadingLightZREd;
    this.pShadingLightZSlider = pShadingLightZSlider;
    this.pShadingLightRedREd = pShadingLightRedREd;
    this.pShadingLightRedSlider = pShadingLightRedSlider;
    this.pShadingLightGreenREd = pShadingLightGreenREd;
    this.pShadingLightGreenSlider = pShadingLightGreenSlider;
    this.pShadingLightBlueREd = pShadingLightBlueREd;
    this.pShadingLightBlueSlider = pShadingLightBlueSlider;
    this.pShadingDistanceColorRadiusREd = pShadingDistanceColorRadiusREd;
    this.pShadingDistanceColorRadiusSlider = pShadingDistanceColorRadiusSlider;
    this.pShadingDistanceColorScaleREd = pShadingDistanceColorScaleREd;
    this.pShadingDistanceColorScaleSlider = pShadingDistanceColorScaleSlider;
    this.pShadingDistanceColorExponentREd = pShadingDistanceColorExponentREd;
    this.pShadingDistanceColorExponentSlider = pShadingDistanceColorExponentSlider;
    this.pShadingDistanceColorOffsetXREd = pShadingDistanceColorOffsetXREd;
    this.pShadingDistanceColorOffsetXSlider = pShadingDistanceColorOffsetXSlider;
    this.pShadingDistanceColorOffsetYREd = pShadingDistanceColorOffsetYREd;
    this.pShadingDistanceColorOffsetYSlider = pShadingDistanceColorOffsetYSlider;
    this.pShadingDistanceColorOffsetZREd = pShadingDistanceColorOffsetZREd;
    this.pShadingDistanceColorOffsetZSlider = pShadingDistanceColorOffsetZSlider;
    this.pMouseTransformSlowButton = pMouseTransformSlowButton;
    this.pRenderBatchJobsTable = pRenderBatchJobsTable;
    this.pBatchPreviewRootPanel = pBatchPreviewRootPanel;
    this.pBatchRenderJobProgressBar = pBatchRenderJobProgressBar;
    this.pBatchRenderTotalProgressBar = pBatchRenderTotalProgressBar;
    this.pJobProgressUpdater = pJobProgressUpdater;
    this.pBatchRenderAddFilesButton = pBatchRenderAddFilesButton;
    this.pBatchRenderFilesMoveDownButton = pBatchRenderFilesMoveDownButton;
    this.pBatchRenderFilesMoveUpButton = pBatchRenderFilesMoveUpButton;
    this.pBatchRenderFilesRemoveButton = pBatchRenderFilesRemoveButton;
    this.pBatchRenderFilesRemoveAllButton = pBatchRenderFilesRemoveAllButton;
    this.pBatchRenderStartButton = pBatchRenderStartButton;
    this.pRootTabbedPane = pRootTabbedPane;
    this.pAffineFlipHorizontalButton = pAffineFlipHorizontalButton;
    this.pAffineFlipVerticalButton = pAffineFlipVerticalButton;
    this.pToggleDarkTrianglesButton = pToggleDarkTrianglesButton;
    this.pShadingBlurRadiusREd = pShadingBlurRadiusREd;
    this.pShadingBlurRadiusSlider = pShadingBlurRadiusSlider;
    this.pShadingBlurFadeREd = pShadingBlurFadeREd;
    this.pShadingBlurFadeSlider = pShadingBlurFadeSlider;
    this.pShadingBlurFallOffREd = pShadingBlurFallOffREd;
    this.pShadingBlurFallOffSlider = pShadingBlurFallOffSlider;
    this.pScriptTextArea = pScriptTextArea;
    this.pAffineScaleXButton = pAffineScaleXButton;
    this.pAffineScaleYButton = pAffineScaleYButton;
    this.pGradientLibraryPanel = pGradientLibraryPanel;
    this.pGradientLibraryGradientCmb = pGradientLibraryGradientCmb;
    this.pHelpPane = pHelpPane;
    this.pFAQPane = pFAQPane;
    this.pToggleVariationsButton = pToggleVariationsButton;
    this.pToggleTransparencyButton = pToggleTransparencyButton;
    this.pAffinePreserveZButton = pAffinePreserveZButton;
    this.pQualityProfileCmb = pQualityProfileCmb;
    this.pResolutionProfileCmb = pResolutionProfileCmb;
    this.pBatchQualityProfileCmb = pBatchQualityProfileCmb;
    this.pBatchResolutionProfileCmb = pBatchResolutionProfileCmb;
    this.pInteractiveQualityProfileCmb = pInteractiveQualityProfileCmb;
    this.pInteractiveResolutionProfileCmb = pInteractiveResolutionProfileCmb;
    this.pSWFAnimatorQualityProfileCmb = pSWFAnimatorQualityProfileCmb;
    this.pSWFAnimatorResolutionProfileCmb = pSWFAnimatorResolutionProfileCmb;
    this.pRenderFlameButton = pRenderFlameButton;
    this.pRenderMainButton = pRenderMainButton;
    this.pAppendToMovieButton = pAppendToMovieButton;
    this.pTransformationWeightREd = pTransformationWeightREd;
    this.pUndoButton = pUndoButton;
    this.pRedoButton = pRedoButton;
    this.pXFormAntialiasAmountREd = pXFormAntialiasAmountREd;
    this.pXFormAntialiasAmountSlider = pXFormAntialiasAmountSlider;
    this.pXFormAntialiasRadiusREd = pXFormAntialiasRadiusREd;
    this.pXFormAntialiasRadiusSlider = pXFormAntialiasRadiusSlider;
    this.pXFormAntialiasCopyToAllBtn = pXFormAntialiasCopyToAllBtn;
    this.pDancingFlamesFlamePnl = pDancingFlamesFlamePnl;
    this.pDancingFlamesGraph1Pnl = pDancingFlamesGraph1Pnl;
    this.pDancingFlamesLoadSoundBtn = pDancingFlamesLoadSoundBtn;
    this.pDancingFlamesAddFromClipboardBtn = pDancingFlamesAddFromClipboardBtn;
    this.pDancingFlamesAddFromEditorBtn = pDancingFlamesAddFromEditorBtn;
    this.pDancingFlamesAddFromDiscBtn = pDancingFlamesAddFromDiscBtn;
    this.pDancingFlamesRandomCountIEd = pDancingFlamesRandomCountIEd;
    this.pDancingFlamesGenRandFlamesBtn = pDancingFlamesGenRandFlamesBtn;
    this.pDancingFlamesRandomGenCmb = pDancingFlamesRandomGenCmb;
    this.pDancingFlamesPoolFlamePreviewPnl = pDancingFlamesPoolFlamePreviewPnl;
    this.pDancingFlamesBorderSizeSlider = pDancingFlamesBorderSizeSlider;
    this.pDancingFlamesFlameToEditorBtn = pDancingFlamesFlameToEditorBtn;
    this.pDancingFlamesDeleteFlameBtn = pDancingFlamesDeleteFlameBtn;
    this.pDancingFlamesFramesPerSecondIEd = pDancingFlamesFramesPerSecondIEd;
    this.pDancingFlamesMorphFrameCountIEd = pDancingFlamesMorphFrameCountIEd;
    this.pDancingFlamesStartShowButton = pDancingFlamesStartShowButton;
    this.pDancingFlamesStopShowButton = pDancingFlamesStopShowButton;
    this.pDancingFlamesDoRecordCBx = pDancingFlamesDoRecordCBx;
    this.pDancingFlamesFlamesCmb = pDancingFlamesFlamesCmb;
    this.pDancingFlamesDrawTrianglesCBx = pDancingFlamesDrawTrianglesCBx;
    this.pDancingFlamesDrawFFTCBx = pDancingFlamesDrawFFTCBx;
    this.pDancingFlamesDrawFPSCBx = pDancingFlamesDrawFPSCBx;
    this.pDancingFlamesFlamePropertiesTree = pDancingFlamesFlamePropertiesTree;
    this.pDancingFlamesMotionPropertyPnl = pDancingFlamesMotionPropertyPnl;
    this.pDancingFlamesMotionTable = pDancingFlamesMotionTable;
    this.pDancingFlamesAddMotionCmb = pDancingFlamesAddMotionCmb;
    this.pDancingFlamesAddMotionBtn = pDancingFlamesAddMotionBtn;
    this.pDancingFlamesDeleteMotionBtn = pDancingFlamesDeleteMotionBtn;
  }

  public void setParams2(JButton pDancingFlamesLinkMotionBtn, JButton pDancingFlamesUnlinkMotionBtn, JComboBox pDancingFlamesCreateMotionsCmb, JButton pDancingFlamesClearMotionsBtn, JButton pDancingFlamesLoadProjectBtn, JButton pDancingFlamesSaveProjectBtn, JTable pDancingFlamesMotionLinksTable,
      JWFNumberField pShadingDistanceColorStyleREd, JSlider pShadingDistanceColorStyleSlider, JWFNumberField pShadingDistanceColorCoordinateREd, JSlider pShadingDistanceColorCoordinateSlider,
      JWFNumberField pShadingDistanceColorShiftREd, JSlider pShadingDistanceColorShiftSlider, JPanel pMutaGen01Pnl, JPanel pMutaGen02Pnl, JPanel pMutaGen03Pnl, JPanel pMutaGen04Pnl, JPanel pMutaGen05Pnl,
      JPanel pMutaGen06Pnl, JPanel pMutaGen07Pnl, JPanel pMutaGen08Pnl, JPanel pMutaGen09Pnl, JPanel pMutaGen10Pnl, JPanel pMutaGen11Pnl, JPanel pMutaGen12Pnl, JPanel pMutaGen13Pnl, JPanel pMutaGen14Pnl,
      JPanel pMutaGen15Pnl, JPanel pMutaGen16Pnl, JPanel pMutaGen17Pnl, JPanel pMutaGen18Pnl, JPanel pMutaGen19Pnl, JPanel pMutaGen20Pnl, JPanel pMutaGen21Pnl, JPanel pMutaGen22Pnl, JPanel pMutaGen23Pnl,
      JPanel pMutaGen24Pnl, JPanel pMutaGen25Pnl) {
    this.pDancingFlamesLinkMotionBtn = pDancingFlamesLinkMotionBtn;
    this.pDancingFlamesUnlinkMotionBtn = pDancingFlamesUnlinkMotionBtn;
    this.pDancingFlamesCreateMotionsCmb = pDancingFlamesCreateMotionsCmb;
    this.pDancingFlamesClearMotionsBtn = pDancingFlamesClearMotionsBtn;
    this.pDancingFlamesLoadProjectBtn = pDancingFlamesLoadProjectBtn;
    this.pDancingFlamesSaveProjectBtn = pDancingFlamesSaveProjectBtn;
    this.pDancingFlamesMotionLinksTable = pDancingFlamesMotionLinksTable;
    this.pShadingDistanceColorStyleREd = pShadingDistanceColorStyleREd;
    this.pShadingDistanceColorStyleSlider = pShadingDistanceColorStyleSlider;
    this.pShadingDistanceColorCoordinateREd = pShadingDistanceColorCoordinateREd;
    this.pShadingDistanceColorCoordinateSlider = pShadingDistanceColorCoordinateSlider;
    this.pShadingDistanceColorShiftREd = pShadingDistanceColorShiftREd;
    this.pShadingDistanceColorShiftSlider = pShadingDistanceColorShiftSlider;
    this.mutaGen01Pnl = pMutaGen01Pnl;
    this.mutaGen02Pnl = pMutaGen02Pnl;
    this.mutaGen03Pnl = pMutaGen03Pnl;
    this.mutaGen04Pnl = pMutaGen04Pnl;
    this.mutaGen05Pnl = pMutaGen05Pnl;
    this.mutaGen06Pnl = pMutaGen06Pnl;
    this.mutaGen07Pnl = pMutaGen07Pnl;
    this.mutaGen08Pnl = pMutaGen08Pnl;
    this.mutaGen09Pnl = pMutaGen09Pnl;
    this.mutaGen10Pnl = pMutaGen10Pnl;
    this.mutaGen11Pnl = pMutaGen11Pnl;
    this.mutaGen12Pnl = pMutaGen12Pnl;
    this.mutaGen13Pnl = pMutaGen13Pnl;
    this.mutaGen14Pnl = pMutaGen14Pnl;
    this.mutaGen15Pnl = pMutaGen15Pnl;
    this.mutaGen16Pnl = pMutaGen16Pnl;
    this.mutaGen17Pnl = pMutaGen17Pnl;
    this.mutaGen18Pnl = pMutaGen18Pnl;
    this.mutaGen19Pnl = pMutaGen19Pnl;
    this.mutaGen20Pnl = pMutaGen20Pnl;
    this.mutaGen21Pnl = pMutaGen21Pnl;
    this.mutaGen22Pnl = pMutaGen22Pnl;
    this.mutaGen23Pnl = pMutaGen23Pnl;
    this.mutaGen24Pnl = pMutaGen24Pnl;
    this.mutaGen25Pnl = pMutaGen25Pnl;
  }

}