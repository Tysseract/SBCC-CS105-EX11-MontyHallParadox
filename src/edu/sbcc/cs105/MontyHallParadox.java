/**
 * CS 105 Theory & Practice I
 * CRN: 62499
 * Assignment: Monty Hall Paradox
 * 
 * @description never trade doors if you want a goat
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Mattys C vanZeyl
 * @website https://www.tysseract.net
 */

package edu.sbcc.cs105;

import java.util.Random;

public class MontyHallParadox {
	
	public static int simulateMontyHallParadox(int experiments, int seed) {
		Random generator = new Random(seed);
		int keepSuccesses = 0;
		int switchSuccesses = 0;
		for(int i = 1; i <= experiments; i++) {
			//randomly assign correct door
			int doorN = generator.nextInt(3);
			boolean[] doors = new boolean[]{ false,false,false }; 
		    doors[doorN] = true;
			
			//pick a door guess
			int doorGuess = generator.nextInt(3);
			
			//do they line up?
		    if(doors[doorGuess]) {
		    	keepSuccesses++;
		    }
		    else {
		    	switchSuccesses++;
		    } 		    
		    
		    /*
		     * //what is your guess?
		     
		    
		    
		    //open a random goat door
		    int openGoat = generator.nextInt(2);
		    while(!((!doors[openGoat]) || (openGoat == doorGuess))) {
		    	openGoat = generator.nextInt(2);
		    */		    
		}
		return switchSuccesses;
	}
	
	public static void main(String args[]) {
		
		System.out.print(simulateMontyHallParadox(Integer.parseInt(args[1]),Integer.parseInt(args[0])));
		
		
	}
}


/* this is my CS133 (MATLAB) code for this same problem:
 * 
 * * * * * * *
%Mattys C vanZeyl
%test strategies

numPlays = 100000;

%Run simulate_monty_hall_strategy using the 'stay' strategy 100,000 times.
fprintf('\nStaying with origionally picked door...\n')
stayWin = simulate_monty_hall_strategy('stay',numPlays);
%calculate persentages
stayWinPercent = stayWin * 100;
stayLosePercent = 100 - stayWinPercent;
%Display results
fprintf('you won %g%% of the time and lose %g%% of the time after trying %g times\n', stayWinPercent, stayLosePercent, numPlays)

%
%Run simulate_monty_hall_strategy using the 'switch' strategy 100,000 times.
fprintf('\nSwitching doors after opening...\n')
switchWin = simulate_monty_hall_strategy('switch',numPlays);
%calculate persentages
switchWinPercent = switchWin * 100;
switchLosePercent = 100 - switchWinPercent;
%Display results
fprintf('you won %g%% of the time and lose %g%% of the time of the time after trying %g times\n', switchWinPercent, switchLosePercent, numPlays)
* * * * * * * *
function winProbability = simulate_monty_hall_strategy(strategy, numPlays)
% strategy: A string that may be either 'stay' or 'switch'
% numPlays: # of times to play the Monty Hall game using strategy
% winProbability: # of times the car is won divided by numPlays

%did they give us a valid strategy input?
strategy(5:6) = ['nn'];
if strategy == 'staynn'
    strategy = 1;
elseif strategy == 'switnn'
    strategy = 0;
else
    error('only enter ''switch'' or ''stay''')
end

 
%how many times are we gonna try this (higher number means more accurate & more time)
attempts = numPlays;
successes = 0;
%repeat that many times
for i = 1:attempts
    %where is the goat? (randomly assign)
    doorN = randi(3);
    doors = [0,0,0];
    doors(doorN) = 1;
    
    %what is your guess?
    doorGuess = randi(3);
    
    %open a random goat door
    opened = 0;
    while opened == 0
        doorCheck = randi(3);
        if doorCheck == doorGuess
            %repeat so that you dont remove the guessed door
        elseif doors(doorCheck) == 0
            %only open if no car
            opened = 1;
            %assign new values absent of opened door
            newDoors = doors;
            newDoors(doorCheck) = [];

            %make sure to correct guessed door
            if (doorGuess) > doorCheck
                newDoorGuess = doorGuess - 1;
            else
                newDoorGuess = doorGuess;
            end
            
        else
            %if car, repeat
        end
    end
    
    %check if your first door was right
    if newDoors(newDoorGuess) == 1
        %with stay if you picked the right door, add a value to successes
        if strategy == 1
            successes = successes + 1;
        end
    else
        %with switch if you picked the wrong door, add a value to successes
        if strategy == 0
            successes = successes + 1;
        end
    end
    
    
end

winProbability = successes/attempts;
end
*/
