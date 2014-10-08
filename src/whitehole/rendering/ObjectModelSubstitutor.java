/*
    Copyright 2012 The Whitehole team

    This file is part of Whitehole.

    Whitehole is free software: you can redistribute it and/or modify it under
    the terms of the GNU General Public License as published by the Free
    Software Foundation, either version 3 of the License, or (at your option)
    any later version.

    Whitehole is distributed in the hope that it will be useful, but WITHOUT ANY 
    WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS 
    FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.

    You should have received a copy of the GNU General Public License along 
    with Whitehole. If not, see http://www.gnu.org/licenses/.
*/

package whitehole.rendering;

import java.io.IOException;
import whitehole.smg.GravityObject;
import whitehole.smg.AreaObject;
import whitehole.smg.LevelObject;
import whitehole.smg.CameraObject;
import whitehole.vectors.Color4;
import whitehole.vectors.Vector3;

public class ObjectModelSubstitutor 
{
    public static String substituteModelName(LevelObject obj, String modelname)
    {
        switch (obj.name)
        {
            case "CoinReplica": return "Coin";
            case "SuperSpinDriverPink": return "SuperSpinDriver";
            case "SuperSpinDriverGreen": return "SuperSpinDriver";
            case "BenefitItemInvincible": return "PowerUpInvincible";
            case "BenefitItemLifeUp": return "KinokoLifeUp";
            case "BenefitItemOneUp": return "KinokoOneUp";
            case "MorphItemNeoBee": return "PowerUpBee";
            case "MorphItemNeoFire": return "PowerUpFire";
            case "MorphItemNeoHopper": return "PowerUpHopper";
            case "MorphItemNeoIce": return "PowerUpIce";
            case "MorphItemNeoTeresa": return "PowerUpTeresa";
            case "MorphItemNeoFoo": return "PowerUpFoo";
            case "MorphItemRock": return "PowerUpRock";
            case "SpinCloudItem": return "PowerUpCloud";
            case "TreasureBoxEmpty": return "TreasureBox";
            case "TreasureBoxKinokoOneUp": return "TreasureBox";
            case "TreasureBoxBlueChip": return "TreasureBox";
            case "TreasureBoxCoin": return "TreasureBox";
            case "TreasureBoxCrackedAirBubble": return "TreasureBoxCracked";
            case "TreasureBoxCrackedBlueChip": return "TreasureBoxCracked";
            case "TreasureBoxCrackedCoin": return "TreasureBoxCracked";
            case "TreasureBoxCrackedEmpty": return "TreasureBoxCracked";
            case "TreasureBoxCrackedKinokoLifeUp": return "TreasureBoxCracked";
            case "TreasureBoxCrackedKinokoOneUp": return "TreasureBoxCracked";
            case "TreasureBoxCrackedPowerStar": return "TreasureBoxCracked";
            case "TreasureBoxCrackedYellowChip": return "TreasureBoxCracked";
            case "TreasureBoxGoldEmpty": return "TreasureBoxGold";
            case "TreasureBoxYellowChip": return "TreasureBox";
            case "ItemBlockSwitch": return "CoinBlock";
            case "TimerCoinBlock": return "CoinBlock";
            case "SplashPieceBlock": return "CoinBlock";
            case "WingBlockStarPiece": return "WingBlock";
            case "WingBlockCoin": return "WingBlock";
            case "JetTurtle": return "Koura";
            case "GoldenTurtle": return "Koura";
            case "NoteFairy": return "Note";
            case "GreenStar": return "PowerStar";
            case "ArrowSwitchMulti": return "ArrowSwitch";
            case "YoshiCapture": return "YCaptureTarget";
            case "Creeper": return "CreeperFlower";
            case "CutBushGroup": return "CutBush";
            case "BombLauncher": return "BombHeiLauncher";
            case "ChildIceMeramera": return "IceMeramera";
            case "ChildMeramera": return "Meramera";
            case "ChildKameck": return "Kameck";
            case "ChildKuribo": return "KuriboMini";
            case "ChildSkeletalFishBaby": return "SkeletalFishBaby";
            case "FireBallBeamKameck": return "Kameck";
            case "TurtleBeamKameck": return "Kameck";
            case "KameckMeramera": return "Kameck";
            case "KameckKuriboMini": return "Kameck";
            case "TubeSliderEnemy": return "Togezo";
            case "TubeSliderDamageObj": return "NeedlePlant";
            case "TubeSliderHana": return "HanachanHeadBig";
            case "HanachanBig": return "HanachanHeadBig";
            case "Hanachan": return "HanachanHead";
            case "ShellfishCoin": return "Shellfish";
            case "ShellfishYellowChip": return "Shellfish";
            case "FirePressureRadiate": return "FirePressure";
            case "GhostPlayer": return "GhostMario";
            case "Horino": return "DrillBullet";
            case "InstantInferno": return "InfernoMario";
            case "Karikari": return "Karipon";
            case "KirairaRail": return "Kiraira";
            case "KoopaStatueVomit": return "KoopaStatue";
            case "OnimasuPivot": return "Onimasu";
            case "PukupukuWaterSurface": return "Pukupuku";
            case "TeresaWater": return "Teresa";
            case "Tongari2D": return "Tongari";
            case "TicoAstro": return "Tico";
            case "TicoFatCoin": return "TicoFat";
            case "TicoRail": return "Tico";
            case "KinopioBank": return "Kinopio";
            case "KinopioPostman": return "Kinopio";
            case "MameMuimuiAttackMan": return "ScoreAttackMan";
            case "MameMuimuiScorer": return "ScoreAttackMan";
            case "MameMuimuiScorerLv2": return "ScoreAttackMan";
            case "PlayAttackMan": return "ScoreAttackMan";
            case "TogepinAttackMan": return "ScoreAttackMan";
            case "Rabbit": return "TrickRabbit";
            case "KoopaNpc": return "Koopa";
            case "GliBirdNpc": return "GliBird";
            case "SignBoardTamakoro": return "SignBoard";
        }
       
        //modelname="TicoCoin";//"VROrbit";//"CollapsePlane";
        return modelname;
    }
    
    public static String substituteObjectKey(LevelObject obj, String objectkey)
    {
        switch (obj.name)
        {
            case "Pole": objectkey += String.format("_%1$3f", obj.scale.y / obj.scale.x); break;
                
            case "Kinopio": 
            case "KinopioAstro": objectkey = String.format("object_Kinopio_%1$d", obj.data.get("Obj_arg1")); break;
                
            case "UFOKinoko": objectkey = String.format("object_UFOKinoko_%1$d", obj.data.get("Obj_arg0")); break;
                                  
                    
            case "AstroDome":
            case "AstroDomeEntrance":
            case "AstroDomeSky":
            case "AstroStarPlate": objectkey += String.format("_%1$d", obj.data.get("Obj_arg0")); break;
        }
        //objectkey = "CollapsePlane";
        return objectkey;
    }
    
    public static GLRenderer substituteRenderer(LevelObject obj, GLRenderer.RenderInfo info)
    {
        try
        {
            if (obj.getClass() == GravityObject.class)
                return new ColorCubeRenderer(100f, new Color4(1f, 0.5f, 0.5f, 1f), new Color4(0.8f, 0f, 0f, 1f), true);
            
            if (obj.getClass() == AreaObject.class)
                return new AreaCubeRenderer(100f, new Color4(1f, 0.5f, 0.5f, 1f), new Color4(0.7f, 0.6f, 0.9f, 0.0f), true);                
 
            if (obj.getClass() == CameraObject.class)
                return new AreaCubeRenderer(100f, new Color4(0.3f, 0f, 1f, 1f), new Color4(0.8f, 0f, 0f, 1f), true);                
            
            switch (obj.name)
            {
                case "Patakuri": return new DoubleBmdRenderer(info, "Kuribo", new Vector3(), "PatakuriWing", new Vector3(0f,15f,-25f));               
                case "Kinopio": 
                
                
                case "KinopioAstro": return new ObjRenderer_Kinopio(info, (int)obj.data.get("Obj_arg1"));
                    
                case "UFOKinoko": return new ObjRenderer_UFOKinoko(info, (int)obj.data.get("Obj_arg0"));
                                      
                    
                case "Pole": return new ObjRenderer_Pole(info, obj.scale);
                    
                case "FlagKoopaA": return new BtiRenderer(info, "FlagKoopaA", new Vector3(0f,150f,0f), new Vector3(0f,-150f,600f), true);
              
                case "FlagPeachCastleA": return new BtiRenderer(info, "FlagPeachCastleA", new Vector3(0f,150f,0f), new  Vector3(0f,-150f,600f), true);     
                case "FlagPeachCastleB": return new BtiRenderer(info, "FlagPeachCastleB", new Vector3(0f,150f,0f), new  Vector3(0f,-150f,600f), true);
                case "FlagPeachCastleC": return new BtiRenderer(info, "FlagPeachCastleC", new Vector3(0f,150f,0f), new  Vector3(0f,-150f,600f), true);                    
                    
                    
                case "AstroDome":
                case "AstroDomeEntrance":
                case "AstroDomeSky":
                case "AstroStarPlate":
                    return new ObjRenderer_AstroPart(info, obj.name, (int)obj.data.get("Obj_arg0"));
                                     
                    
                    
                case "RedBlueTurnBlock": return new DoubleBmdRenderer(info, "RedBlueTurnBlock", new Vector3(), "RedBlueTurnBlockBase", new Vector3());
                
                case "BegomanSpike": return new DoubleBmdRenderer(info, "BegomanSpikeHead", new Vector3(), "BegomanSpike", new Vector3());
                    
                case "BegomanSpring": return new DoubleBmdRenderer(info, "BegomanSpringHead", new Vector3(), "BegomanSpring", new Vector3());
                
                case "BegomanSpringHide": return new DoubleBmdRenderer(info, "BegomanSpringHead", new Vector3(), "BegomanSpring", new Vector3());
                
                case "Nyoropon": return new DoubleBmdRenderer(info, "NyoroponHead", new Vector3(), "NyoroponBody", new Vector3());
                
                case "KillerShooter": return new DoubleBmdRenderer(info, "MogucchiSpike", new Vector3(), "GliderBazooka", new Vector3());
                
                case "GliderShooter": return new DoubleBmdRenderer(info, "MogucchiSpike", new Vector3(), "GliderBazooka", new Vector3());            
            }
        }
        catch (IOException ex) {}
        
        return null;
        
        
        
    }
}
