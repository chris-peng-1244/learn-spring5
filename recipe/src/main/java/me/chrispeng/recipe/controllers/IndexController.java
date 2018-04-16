package me.chrispeng.recipe.controllers;

import me.chrispeng.recipe.domain.Category;
import me.chrispeng.recipe.domain.Recipe;
import me.chrispeng.recipe.domain.UnitOfMeasure;
import me.chrispeng.recipe.repositories.CategoryRepository;
import me.chrispeng.recipe.repositories.UnitOfMeasureRepository;
import me.chrispeng.recipe.service.RecipeService;
import me.chrispeng.recipe.service.RecipeServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

	private CategoryRepository categoryRepository;
	private UnitOfMeasureRepository unitOfMeasureRepository;
	private RecipeService recipeService;

	public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository, RecipeService recipeService) {
		this.categoryRepository = categoryRepository;
		this.unitOfMeasureRepository = unitOfMeasureRepository;
		this.recipeService = recipeService;
	}

	@RequestMapping({"", "/", "/index"})
	public String index(Model model) {
		Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
		Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");

		Iterable<Recipe> recipes = recipeService.getRecipes();
		model.addAttribute("recipes", recipes);

		System.out.println("Cat Id is: " + categoryOptional.get().getId());
		System.out.println("UOM Id is: " + unitOfMeasureOptional.get().getId());
		return "index";
	}
}
