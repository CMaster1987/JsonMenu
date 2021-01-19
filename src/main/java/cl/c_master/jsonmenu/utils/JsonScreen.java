package cl.c_master.jsonmenu.utils;

import com.google.gson.*;

import net.minecraft.util.JsonHelper;

public class JsonScreen
{
    public void deserialize(JsonObject obj)
    {
        if(obj.has("buttons"))
        {
            JsonArray buttons = JsonHelper.getArray(obj, "buttons");
            JsonObject button = buttons.getAsJsonObject();
            if(JsonHelper.hasArray(button, "name"))
            {
                JsonArray name = JsonHelper.getArray(button, "name");
                JsonObject textOrTranslatate = name.getAsJsonObject();
                if(textOrTranslatate.has("Text"))
                {
                    String text = JsonHelper.getString(textOrTranslatate, "Text");
                }
                else if(textOrTranslatate.has("Translate"))
                {
                    String translate = JsonHelper.getString(textOrTranslatate, "Translate");
                }
                if(textOrTranslatate.has("color"))
                {
                    int color = JsonHelper.asInt(textOrTranslatate, "color");
                }
            }
            else if(button.has("name"))
            {
                JsonObject nameObject = JsonHelper.getObject(button, "name");
                if(nameObject.has("Text"))
                {
                    String text = JsonHelper.getString(nameObject, "Text");
                }
                else if(nameObject.has("Translate"))
                {
                    String translate = JsonHelper.getString(nameObject, "Translate");
                }
                if(nameObject.has("color"))
                {
                    int color = JsonHelper.asInt(nameObject, "color");
                }
            }
        }
    }
}
