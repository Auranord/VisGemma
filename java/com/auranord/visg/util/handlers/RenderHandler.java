package com.auranord.visg.util.handlers;

import com.auranord.visg.entity.EntityTest;
import com.auranord.visg.entity.render.RenderTest;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {
	
	public static void registerEntityRenders() {
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTest.class, new IRenderFactory<EntityTest>() {
		
			@Override
			public Render<? super EntityTest> createRenderFor(RenderManager manager) {

				return new RenderTest(manager);
			}
					
		});		
		
	}

}
