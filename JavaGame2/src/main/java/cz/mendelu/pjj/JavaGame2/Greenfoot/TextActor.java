package cz.mendelu.pjj.JavaGame2.Greenfoot;

import greenfoot.Actor;
import greenfoot.GreenfootImage;

import java.awt.*;
import java.awt.color.ColorSpace;
import java.awt.image.ColorModel;
import java.util.Objects;
/**
 * Třída pro zobrazní textu v menu a geme
 * @author xmarozau
 * @version etapa 4
 */

public class TextActor extends Actor {
    private String text;

    public TextActor(String text) {
        this.setText(text);
    }

    public TextActor() {
        setText(getClass().getSimpleName());
    }

    public void setText(String text) {
        if (!Objects.equals(this.text, text)) {
            this.text = text;
            var image = new GreenfootImage(text,30,Color.BLACK,new Color(255,255,255,0));
            setImage(image);
        }
    }

    protected String updateText() {
        return null;
    }

    @Override
    public void act() {
        var newText = updateText();
        if (newText != null) {
            setText(newText);
        }
    }
}
